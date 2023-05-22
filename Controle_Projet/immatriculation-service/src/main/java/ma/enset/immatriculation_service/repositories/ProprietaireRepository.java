package ma.enset.immatriculation_service.repositories;


import ma.enset.immatriculation_service.entities.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;


@RepositoryRestResource
public interface ProprietaireRepository extends JpaRepository<Proprietaire,Long> {

    Optional<Proprietaire> findByNom(String nom);
}
