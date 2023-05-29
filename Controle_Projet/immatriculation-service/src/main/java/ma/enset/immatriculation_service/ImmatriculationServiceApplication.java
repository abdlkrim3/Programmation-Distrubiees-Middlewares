package ma.enset.immatriculation_service;

import ma.enset.immatriculation_service.entities.Proprietaire;
import ma.enset.immatriculation_service.entities.Vehicule;
import ma.enset.immatriculation_service.repositories.ProprietaireRepository;
import ma.enset.immatriculation_service.repositories.VehiculeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


@SpringBootApplication
public class ImmatriculationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmatriculationServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository, RepositoryRestConfiguration repositoryRestConfiguration){
        repositoryRestConfiguration.exposeIdsFor(Proprietaire.class);
        repositoryRestConfiguration.exposeIdsFor(Vehicule.class);
        return args -> {
            Proprietaire agoujil = new Proprietaire(null, "AGOUJIL", "06-10-2000", "agoujil1@gmail.com",null);
            Proprietaire ablkrim = new Proprietaire(null, "Ablkrim", "06-10-2000", "abdlkrim2@gmail.com",null);
            proprietaireRepository.save(agoujil);
            proprietaireRepository.save(ablkrim);
            Vehicule vehicule1 = new Vehicule(null,"764TERETRE","Dacia","20PH","2010",agoujil);
            Vehicule vehicule2 = new Vehicule(null,"764TGFRT87","ford","300FH","2020",agoujil);
            vehiculeRepository.save(vehicule1);
            vehiculeRepository.save(vehicule2);
            vehiculeRepository.save(new Vehicule(null,"764TERSEM","toyota","20PH","2010",ablkrim));

        };
    }

}
