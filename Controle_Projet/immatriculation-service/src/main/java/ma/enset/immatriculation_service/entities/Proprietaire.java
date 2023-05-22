package ma.enset.immatriculation_service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Proprietaire {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String nom;
    private String dateNaissance;
    private String email;
    @OneToMany(mappedBy = "proprietaire")
    @Transient
    private List<Vehicule> vehicules;
}
