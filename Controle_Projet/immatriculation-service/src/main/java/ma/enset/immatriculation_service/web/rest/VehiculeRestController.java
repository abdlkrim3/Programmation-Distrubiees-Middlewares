package ma.enset.immatriculation_service.web.rest;

import ma.enset.immatriculation_service.dto.VehiculeDto;
import ma.enset.immatriculation_service.entities.Proprietaire;
import ma.enset.immatriculation_service.entities.Vehicule;
import ma.enset.immatriculation_service.repositories.ProprietaireRepository;
import ma.enset.immatriculation_service.repositories.VehiculeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class VehiculeRestController {
    private VehiculeRepository vehiculeRepository;
    private ProprietaireRepository proprietaireRepository;
    private VehiculeDto vehiculeDto;

    public VehiculeRestController(VehiculeRepository vehiculeRepository, ProprietaireRepository proprietaireRepository) {
        this.vehiculeRepository = vehiculeRepository;
        this.proprietaireRepository = proprietaireRepository;
    }

    @GetMapping("/vehicules")
    public List<Vehicule> vehicules(){
        return vehiculeRepository.findAll();

    }
    @GetMapping("/vehicules/{id}")
    public Vehicule vehicule(@PathVariable String id){
        return vehiculeRepository.findById(Long.valueOf(id))
                .orElseThrow(()->new RuntimeException(String.format("Vehicule % not found",id)));
    }
    @PostMapping("/vehicules")
    public Vehicule save(@RequestBody VehiculeDto vehiculeDto){
        Proprietaire proprietaire=proprietaireRepository.findByNom(vehiculeDto.getNom()).get();
        Vehicule vehicule=new Vehicule().builder()
                .model(vehiculeDto.getModel())
                .fiscalePuissance(vehiculeDto.getFiscalePuissance())
                .proprietaire(proprietaire)
                .matrecule(vehiculeDto.getMatrecule())
                .marque(vehiculeDto.getMarque())
                .build();
        return vehiculeRepository.save(vehicule);
    }
    @PutMapping("/vehicules/{id}")
    public Vehicule update(@PathVariable String id,@RequestBody Vehicule vehicule){
        Vehicule vehicule1=vehiculeRepository.findById(Long.valueOf(id)).orElseThrow();
        if(vehicule.getMarque()!=null) vehicule1.setMarque(vehicule.getMarque());
        if(vehicule.getModel()!=null) vehicule1.setModel (vehicule.getModel());
        if(vehicule.getMatrecule()!=null) vehicule1.setMatrecule (vehicule.getMatrecule());
        if(vehicule.getProprietaire()!=null) vehicule1.setProprietaire(vehicule.getProprietaire());
        if(vehicule.getFiscalePuissance()!=null) vehicule1.setFiscalePuissance(vehicule.getFiscalePuissance());
        return vehiculeRepository.save(vehicule1);
    }
    @DeleteMapping("/vehicules/{id}")
    public void delete(@PathVariable String id){
        vehiculeRepository.deleteById(Long.valueOf(id));
    }
}
