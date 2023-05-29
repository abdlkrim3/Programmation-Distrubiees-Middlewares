package ma.enset.immatriculation_service.web.graphQL;

import lombok.AllArgsConstructor;
import ma.enset.immatriculation_service.entities.Vehicule;
import ma.enset.immatriculation_service.repositories.VehiculeRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class VehiculeGraphQlService {
    private VehiculeRepository vehiculeRepository;

    @QueryMapping
    public List<Vehicule> vehicules(){
        return vehiculeRepository.findAll();
    }
    @QueryMapping
    public Vehicule vehiculeRequestById(@Argument Long id){
        return vehiculeRepository.findById(id).get();
    }
    @MutationMapping
    public Vehicule saveVehicule(@Argument Vehicule vehicule){
        return vehiculeRepository.save(vehicule);
    }
}
