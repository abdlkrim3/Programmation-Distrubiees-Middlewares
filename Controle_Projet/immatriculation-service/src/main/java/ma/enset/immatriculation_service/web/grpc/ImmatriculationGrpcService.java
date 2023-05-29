package ma.enset.immatriculation_service.web.grpc;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import ma.enset.immatriculation_service.entities.Proprietaire;
import ma.enset.immatriculation_service.entities.Vehicule;
import ma.enset.immatriculation_service.mappers.GrpcMapper;
import ma.enset.immatriculation_service.repositories.ProprietaireRepository;
import ma.enset.immatriculation_service.repositories.VehiculeRepository;
import ma.enset.immatriculation_service.web.grpc.stub.Immatriculation;
import ma.enset.immatriculation_service.web.grpc.stub.ImmatriculationServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@GrpcService
@AllArgsConstructor
public class ImmatriculationGrpcService extends ImmatriculationServiceGrpc.ImmatriculationServiceImplBase {
    private ProprietaireRepository proprietaireRepository;
    private VehiculeRepository vehiculeRepository;
    private GrpcMapper grpcMapper;

    @Override
    public void getListVehicule(Immatriculation.GetAllVehiculesRequest request , StreamObserver<Immatriculation.GetAllVehiculesResponse> responseObserver){
        List<Vehicule> vehicules= this.vehiculeRepository.findAll();
        List<Immatriculation.Vehicule> vehiculeList=vehicules.stream().map(account->grpcMapper.fromVehiculeEntity(account)).collect(Collectors.toList());
        Immatriculation.GetAllVehiculesResponse vehiculesListResponse=Immatriculation.GetAllVehiculesResponse.newBuilder()
                .addAllVehicule(vehiculeList)
                .build();
        responseObserver.onNext(vehiculesListResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getListProprietaire(Immatriculation.GetAllProprietairesRequest request , StreamObserver<Immatriculation.GetAllProprietairesResponse> responseObserver){
        List<Proprietaire> proprietaires= this.proprietaireRepository.findAll();
        List<Immatriculation.Proprietaire> proprietaires1=proprietaires.stream().map(grpcMapper::fromProprietaireEntity).collect(Collectors.toList());
        Immatriculation.GetAllProprietairesResponse proprietaireResponse=Immatriculation.GetAllProprietairesResponse.newBuilder()
                .addAllProprietaire(proprietaires1)
                .build();
        responseObserver.onNext(proprietaireResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getProprietaire(Immatriculation.GetProprietaireRequest request, StreamObserver<Immatriculation.GetProprietaireResponse> responseObserver) {
        Long id=request.getId();
        Proprietaire proprietaire=proprietaireRepository.findById(id).get();
        Immatriculation.Proprietaire grpcProprietaire= grpcMapper.fromProprietaireEntity(proprietaire);
        Immatriculation.GetProprietaireResponse response = Immatriculation.GetProprietaireResponse.newBuilder()
                .setProprietaire(grpcProprietaire)
                .build();

    }

    @Override
    public void getVehicule(Immatriculation.GetVehiculeRequest request, StreamObserver<Immatriculation.GetVehiculeResponse> responseObserver) {
        super.getVehicule(request, responseObserver);
    }
}
