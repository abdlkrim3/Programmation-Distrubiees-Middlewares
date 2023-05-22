package ma.enset.radarservice.web.rest;

import ma.enset.radarservice.entities.Radar;
import ma.enset.radarservice.repositories.RadarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RadarRestController {

    RadarRepository radarRepository;

    public RadarRestController(RadarRepository radarRepository) {
        this.radarRepository = radarRepository;
    }

    @GetMapping("/radars")
    public List<Radar> getRadars(){
        return radarRepository.findAll();
    }

    //  *********
    @GetMapping("/radars/{id}")
    public Radar getRadarById(@PathVariable Long id){
        return radarRepository.findById(id).get();
    }

    @PostMapping("/radars")
    public Radar addVehicule(@RequestBody Radar radar){
        return radarRepository.save(radar);
    }

}
