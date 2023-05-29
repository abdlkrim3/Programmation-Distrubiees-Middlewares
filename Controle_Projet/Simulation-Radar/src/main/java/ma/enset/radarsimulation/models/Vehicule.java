package ma.enset.radarsimulation.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Vehicule {

    private Long id;
    private String matricule;
    private String marque;
    private int puissance_fiscale;
    private String model;
    private Proprietaire proprietaire;
}