package ma.enset.immatriculation_service.repositories;


import ma.enset.immatriculation_service.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {
}
