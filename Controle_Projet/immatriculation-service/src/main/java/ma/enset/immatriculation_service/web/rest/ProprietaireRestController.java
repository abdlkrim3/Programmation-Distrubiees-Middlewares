package ma.enset.immatriculation_service.web.rest;

import ma.enset.immatriculation_service.entities.Proprietaire;
import ma.enset.immatriculation_service.repositories.ProprietaireRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProprietaireRestController {
    private ProprietaireRepository proprietaireRepository;


    public ProprietaireRestController(ProprietaireRepository proprietaireRepository) {
        this.proprietaireRepository = proprietaireRepository;
    }
    @GetMapping("/proprietaires")
    public List<Proprietaire> proprietaires(){
        return proprietaireRepository.findAll();

    }
    @GetMapping("/proprietaires/{id}")
    public Proprietaire proprietaire(@PathVariable String id){
        return proprietaireRepository.findById(Long.valueOf(id))
                .orElseThrow(()->new RuntimeException(String.format("Proprietaire % not found",id)));
    }
    @PostMapping("/proprietaires")
    public Proprietaire save(@RequestBody Proprietaire proprietaire){
        return proprietaireRepository.save(proprietaire);
    }
    @PutMapping("/proprietaires/{id}")
    public Proprietaire update(@PathVariable String id,@RequestBody Proprietaire proprietaire){
        Proprietaire proprietaire1=proprietaireRepository.findById(Long.valueOf(id)).orElseThrow();
        if(proprietaire.getNom()!=null) proprietaire1.setNom(proprietaire.getNom());
        if(proprietaire.getDateNaissance()!=null) proprietaire1.setDateNaissance (proprietaire.getDateNaissance());
        if(proprietaire.getEmail()!=null) proprietaire1.setEmail (proprietaire.getEmail());
        if(proprietaire.getVehicules()!=null) proprietaire1.setVehicules(proprietaire.getVehicules());
        return proprietaireRepository.save(proprietaire1);
    }
    @DeleteMapping("/proprietaires/{id}")
    public void delete(@PathVariable String id){
        proprietaireRepository.deleteById(Long.valueOf(id));
    }
}
