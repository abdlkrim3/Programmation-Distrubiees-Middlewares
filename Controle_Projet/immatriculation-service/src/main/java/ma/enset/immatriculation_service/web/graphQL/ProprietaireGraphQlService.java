package ma.enset.immatriculation_service.web.graphQL;

import lombok.AllArgsConstructor;
import ma.enset.immatriculation_service.entities.Proprietaire;
import ma.enset.immatriculation_service.repositories.ProprietaireRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ProprietaireGraphQlService {
    private ProprietaireRepository proprietaireRepository;

    @QueryMapping
    public List<Proprietaire> proprietaires(){
        return proprietaireRepository.findAll();
    }
    @QueryMapping
    public Proprietaire proprietaireRequestById(@Argument Long id){
        System.out.println(id);
        System.out.println(proprietaireRepository.findById(id).get());
        return proprietaireRepository.findById(id).get();
    }
    @MutationMapping
    public Proprietaire saveProprietaire(@Argument Proprietaire proprietaire){
        return proprietaireRepository.save(proprietaire);
    }
}
