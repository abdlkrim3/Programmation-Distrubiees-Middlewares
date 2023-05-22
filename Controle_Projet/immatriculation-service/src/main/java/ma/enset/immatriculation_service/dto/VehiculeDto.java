package ma.enset.immatriculation_service.dto;

import lombok.Data;

@Data
public class VehiculeDto {
    String nom;
    private String matrecule;
    private String marque;
    private String fiscalePuissance;
    private String model;

}
