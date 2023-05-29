package ma.enset.radarservice.mappers;

import ma.enset.radarservice.entities.Radar;
import ma.enset.radarservice.web.grpc.stub.RadarOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RadarMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public RadarOuterClass.Radar fromClient(Radar radar){
        return modelMapper.map(radar, RadarOuterClass.Radar.Builder.class).build();
    }
}
