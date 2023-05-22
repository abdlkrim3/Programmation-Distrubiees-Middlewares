package ma.enset.radarservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.radarservice.entities.Radar;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Infraction {

    private Long id;
    private Date dateInfraction;
    private Long radarId;
    private Long vehiculeId;
    private double vitesseVehicule;
    private double maxVitesseAccepte;
    private double montant;
    private boolean state;
    private Vehicule vehicule;
    private Radar radar;
}
