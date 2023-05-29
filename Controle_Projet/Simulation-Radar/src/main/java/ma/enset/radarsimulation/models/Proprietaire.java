package ma.enset.radarsimulation.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Proprietaire {

    private Long id;
    private String nom;
    private String DateNaissance;
    private String email;
}
