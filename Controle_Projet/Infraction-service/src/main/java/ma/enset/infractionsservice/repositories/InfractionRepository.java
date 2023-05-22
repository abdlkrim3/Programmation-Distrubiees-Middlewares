package ma.enset.infractionsservice.repositories;

import ma.enset.infractionsservice.entities.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InfractionRepository extends JpaRepository<Infraction,Long> {

}
