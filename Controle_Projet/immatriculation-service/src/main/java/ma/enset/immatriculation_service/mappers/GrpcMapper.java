package ma.enset.immatriculation_service.mappers;

import ma.enset.immatriculation_service.entities.Proprietaire;
import ma.enset.immatriculation_service.entities.Vehicule;
import ma.enset.immatriculation_service.web.grpc.stub.Immatriculation ;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class GrpcMapper {
    public Immatriculation.Vehicule fromVehiculeEntity(Vehicule vehicule){
        Immatriculation.Vehicule vehiculeGrpc=Immatriculation.Vehicule.newBuilder()
                .setMarque(vehicule.getMarque())
                .setModele(vehicule.getModel())
                .setMatricule(vehicule.getMatrecule())
                .setFiscalePuissance(vehicule.getFiscalePuissance())
                .setProprietaire(fromProprietaireEntity(vehicule.getProprietaire()))
                .build();
        return vehiculeGrpc;
    }
    public Vehicule fromVehiculeGrpc(Immatriculation.Vehicule vehicule) throws ParseException {
        Vehicule vehicule1=Vehicule.builder()
                .model(vehicule.getModele())
                .marque(vehicule.getMarque())
                .fiscalePuissance(vehicule.getFiscalePuissance())
                .matrecule(vehicule.getMatricule())
                .proprietaire(fromProprietaireGrpc(vehicule.getProprietaire()))
                .build();
        return vehicule1;
    }

    public Immatriculation.Proprietaire fromProprietaireEntity(Proprietaire proprietaire){
        Immatriculation.Proprietaire proprietaireGrpc=Immatriculation.Proprietaire.newBuilder()
                .setNom(proprietaire.getNom())
                .setDateNaissance(proprietaire.getDateNaissance())
                .setEmail(proprietaire.getEmail())
                .build();
        return proprietaireGrpc;
    }
    public Proprietaire fromProprietaireGrpc(Immatriculation.Proprietaire proprietaire) throws ParseException {
        List<Vehicule> vehicules=new ArrayList<>();
        for(Immatriculation.Vehicule vehicule:proprietaire.getVehiculesList()){
            vehicules.add(fromVehiculeGrpc(vehicule));
        }
        Proprietaire proprietaire1=Proprietaire.builder()
                .nom(proprietaire.getNom())
                .email(proprietaire.getEmail())
                .dateNaissance(proprietaire.getDateNaissance())
                .vehicules(vehicules)
                .build();
        return proprietaire1;
    }
}
