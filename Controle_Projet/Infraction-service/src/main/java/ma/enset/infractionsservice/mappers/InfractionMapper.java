package ma.enset.infractionsservice.mappers;


import ma.enset.infractionsservice.entities.Infraction;
import ma.enset.infractionsservice.web.grpc.stub.InfractionOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class InfractionMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public InfractionOuterClass.Infraction fromClient(Infraction radar){
        return modelMapper.map(radar, InfractionOuterClass.Infraction.Builder.class).build();
    }
}
