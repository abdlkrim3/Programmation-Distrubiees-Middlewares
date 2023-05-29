package ma.enset.radarservice.web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import ma.enset.radarservice.entities.Radar;
import ma.enset.radarservice.feign.InfractionRestClient;
import ma.enset.radarservice.feign.VehiculeRestClient;
import ma.enset.radarservice.mappers.RadarMapper;
import ma.enset.radarservice.models.Infraction;
import ma.enset.radarservice.models.Vehicule;
import ma.enset.radarservice.repositories.RadarRepository;
import ma.enset.radarservice.web.grpc.stub.RadarGrpcServiceGrpc;
import ma.enset.radarservice.web.grpc.stub.RadarOuterClass;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@GrpcService
@AllArgsConstructor
public class RadarGrpcService extends RadarGrpcServiceGrpc.RadarGrpcServiceImplBase {

    RadarRepository radarRepository;
    VehiculeRestClient vehiculeRestClient;
    InfractionRestClient infractionRestClient;
    RadarMapper radarMapper;

    @Override
    public void saveRadar(RadarOuterClass.SaveRadarRequest request, StreamObserver<RadarOuterClass.SaveRadarResponse> responseObserver) {
        Radar radar = new Radar().builder()
                .id(null)
                .maxVitesseAccepte(request.getMaxVitesseAccepte())
                .longitude(request.getLongitude())
                .latitude(request.getLatitude())
                .build();

        radarRepository.save(radar);
        RadarOuterClass.Radar grpcRadar = radarMapper.fromClient(radar);
        RadarOuterClass.SaveRadarResponse radarsResponse = RadarOuterClass.SaveRadarResponse.newBuilder()
                .setRadar(grpcRadar)
                .build();
        responseObserver.onNext(radarsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getRadar(RadarOuterClass.GetRadarRequest request, StreamObserver<RadarOuterClass.GetRadarResponse> responseObserver) {
        Radar radar = radarRepository.findById(request.getId()).get();
        RadarOuterClass.Radar grpcRadar = radarMapper.fromClient(radar);
        RadarOuterClass.GetRadarResponse radarsResponse = RadarOuterClass.GetRadarResponse.newBuilder()
                .setRadar(grpcRadar)
                .build();
        responseObserver.onNext(radarsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getListRadars(RadarOuterClass.GetAllRadarsRequest request, StreamObserver<RadarOuterClass.GetAllRadarsResponse> responseObserver) {
        List<Radar> radarList = radarRepository.findAll();
        RadarOuterClass.GetAllRadarsResponse.Builder radarBuilder = RadarOuterClass.GetAllRadarsResponse.newBuilder();
        List<RadarOuterClass.Radar> radars = radarList.stream().map(radarMapper::fromClient).collect(Collectors.toList());
        radarBuilder.addAllRadars(radars);
        responseObserver.onNext(radarBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<RadarOuterClass.SaveRadarRequest> radarControl(StreamObserver<RadarOuterClass.DetecterSurvitesse> responseObserver) {
        return new StreamObserver<RadarOuterClass.SaveRadarRequest>() {

            boolean overSpeed = false;
            @Override
            public void onNext(RadarOuterClass.SaveRadarRequest saveRadarRequest) {
                if(saveRadarRequest.getVitesseVehicule() > saveRadarRequest.getVitesseVehicule()) {
                    overSpeed = true;

                    Vehicule vehicule = vehiculeRestClient.getVehiculeByMatricule(saveRadarRequest.getMatricule());
                    Radar radar = radarRepository.findById(saveRadarRequest.getRadarId()).get();
                    infractionRestClient.save(
                            new Infraction().builder()
                                    .dateInfraction(new Date())
                                    .vehiculeId(vehicule.getId())
                                    .radarId(radar.getId())
                                    .maxVitesseAccepte(saveRadarRequest.getMaxVitesseAccepte())
                                    .vitesseVehicule(saveRadarRequest.getVitesseVehicule())
                                    .vehicule(vehicule)
                                    .radar(radar)
                                    .montant(calculateFine(saveRadarRequest.getVitesseVehicule()-saveRadarRequest.getMaxVitesseAccepte()))
                                    .build()
                    );

                }
                RadarOuterClass.DetecterSurvitesse response = RadarOuterClass.DetecterSurvitesse.newBuilder()
                        .setAccelere(overSpeed)
                        .build();
                System.out.println("Speed Status "+ overSpeed);
                responseObserver.onNext(response);
                overSpeed = false;
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

                responseObserver.onCompleted();
            }
        };
    }

    public float calculateFine(float overSpeedRang) {
        float fine = 0.0f;

        // Check violation type and assign corresponding fine amount
        if (overSpeedRang >= 30) {
            fine = 700.0f;
        } else if (overSpeedRang >= 20) {
            fine = 400.0f;
        } else{
            fine = 200.0f;
        }

        return fine;
    }
}
