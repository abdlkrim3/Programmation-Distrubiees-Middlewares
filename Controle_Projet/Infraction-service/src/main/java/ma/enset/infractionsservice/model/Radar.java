package ma.enset.infractionsservice.model;

import  lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Radar {

    private Long id;
    private double vitesseMax;
    private double longitude;
    private double latitude;
}
