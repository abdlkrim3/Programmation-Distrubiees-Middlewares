package ma.enset.radarservice.web.graphql;

import ma.enset.radarservice.entities.Radar;
import ma.enset.radarservice.repositories.RadarRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class RadarGraphqlController {


    RadarRepository radarRepository;

    public RadarGraphqlController(RadarRepository radarRepository) {
        this.radarRepository = radarRepository;
    }

    @QueryMapping
    public List<Radar> getRadars(){
        return radarRepository.findAll();
    }

    @QueryMapping
    public Radar getRadarById(Long id){
        return radarRepository.findById(id).get();
    }
}
