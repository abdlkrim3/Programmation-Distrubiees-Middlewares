package ma.enset.radarsimulation.models;

import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Infraction {

    private Long id;
    private Date date;
    private Long radar_id;
    private Long vehicule_id;
    private double vitesse_vehicule;
    private double vitesseMax;
    private double montant;
    private boolean state;
    private Vehicule vehicule;
    private Radar radar;
}
