package ma.enset.infractionsservice;

import lombok.Builder;
import lombok.Data;
import ma.enset.infractionsservice.entities.Infraction;
import ma.enset.infractionsservice.repositories.InfractionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Properties;

@SpringBootApplication
@Builder
public class InfractionsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfractionsServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(InfractionRepository infractionRepository) {
		return args -> {
			infractionRepository.save(
					new Infraction().builder()
							.dateInfraction(new Date())
							.vehiculeId(1L)
							.radarId(1L)
							.maxVitesseAccepte(120)
							.vitesseVehicle(130)
							.montant(600)
							.build()
			);

		};
	}
}