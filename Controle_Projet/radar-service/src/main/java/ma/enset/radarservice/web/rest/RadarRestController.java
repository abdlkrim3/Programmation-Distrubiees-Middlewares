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
    @PutMapping("/radars/{id}")
    public Radar updateRadarById(@PathVariable Long id,@RequestBody Radar radar){
        Radar radar1=radarRepository.findById(Long.valueOf(id)).orElseThrow();
        if(radar.getLatitude()!=0) radar1.setLatitude(radar.getLatitude());
        if(radar.getLongitude()!=0) radar1.setLongitude(radar.getLongitude());
        if(radar.getMaxVitesseAccepte()!=0) radar1.setMaxVitesseAccepte(radar.getMaxVitesseAccepte());

        return radarRepository.save(radar1);
    }
    @DeleteMapping("/radars/{id}")
    public void delete(@PathVariable String id){
        radarRepository.deleteById(Long.valueOf(id));
    }



}
