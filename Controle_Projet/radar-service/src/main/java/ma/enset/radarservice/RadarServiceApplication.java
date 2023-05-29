package ma.enset.radarservice;

import ma.enset.radarservice.entities.Radar;
import ma.enset.radarservice.repositories.RadarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.text.DecimalFormat;

@SpringBootApplication
@EnableFeignClients
public class RadarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadarServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(RadarRepository radarRepository){
		return args -> {
			DecimalFormat numberFormat = new DecimalFormat("#.0000");
			int vitesse=90;
			for (int i = 0; i < 4; i++) {
				radarRepository.save(
						new Radar().builder()
								.id(null)
								.maxVitesseAccepte(vitesse)
								.longitude(Math.random()*100)
								.latitude(Math.random()*100)
								.build()
				);
				vitesse+=20;
			}
		};
	}
}
