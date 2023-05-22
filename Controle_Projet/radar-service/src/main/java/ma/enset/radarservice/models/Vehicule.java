package ma.enset.radarservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor @Builder
public class Vehicule {
    private Long id;
    private String matricule;
    private String marque;
    private int fiscalePuissance;
    private String model;
    private Proprietaire proprietaire;
}
