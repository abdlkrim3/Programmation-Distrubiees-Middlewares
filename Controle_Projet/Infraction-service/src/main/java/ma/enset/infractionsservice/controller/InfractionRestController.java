package ma.enset.infractionsservice.controller;

import lombok.AllArgsConstructor;
import ma.enset.infractionsservice.entities.Infraction;
import ma.enset.infractionsservice.repositories.InfractionRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class InfractionRestController {
    private InfractionRepository infractionRepository;

    @GetMapping("/infractions")
        public List<Infraction> infractions(){
            return infractionRepository.findAll();

        }
        @GetMapping("/infractions/{id}")
        public Infraction infraction(@PathVariable String id){
            return infractionRepository.findById(Long.valueOf(id))
                    .orElseThrow(()->new RuntimeException(String.format("infraction % not found",id)));
        }
        @PostMapping("/infractions")
        public Infraction save(@RequestBody Infraction infraction){
            return infractionRepository.save(infraction);
        }
        @PutMapping("/infractions/{id}")
        public Infraction update(@PathVariable String id,@RequestBody Infraction infraction){
            Infraction infraction1=infractionRepository.findById(Long.valueOf(id)).orElseThrow();
            if(infraction.getMatricule()!=null) infraction1.setMatricule(infraction.getMatricule());
            if(infraction.getDateInfraction()!=null) infraction1.setDateInfraction (infraction.getDateInfraction());
            if(infraction.getVitesseVehicle()!=0.0) infraction1.setVitesseVehicle (infraction.getVitesseVehicle());
            if(infraction.getRadarId()!=null) infraction1.setRadarId(infraction.getRadarId());
            if(infraction.getMontant()!=0.0) infraction1.setMontant(infraction.getMontant());
            if(infraction.getMaxVitesseAccepte()!=0.0) infraction1.setMaxVitesseAccepte(infraction.getMaxVitesseAccepte());
            return infractionRepository.save(infraction1);
        }
        @DeleteMapping("/infractions/{id}")
        public void delete(@PathVariable String id){
            infractionRepository.deleteById(Long.valueOf(id));
        }
    }



