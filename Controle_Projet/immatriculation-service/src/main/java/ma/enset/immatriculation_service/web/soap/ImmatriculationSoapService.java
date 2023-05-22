package ma.enset.immatriculation_service.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import lombok.Data;
import ma.enset.immatriculation_service.entities.Proprietaire;
import ma.enset.immatriculation_service.entities.Vehicule;
import ma.enset.immatriculation_service.repositories.ProprietaireRepository;
import ma.enset.immatriculation_service.repositories.VehiculeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "ImmatriculationWS")
//@AllArgsConstructor
public class ImmatriculationSoapService {
    private ProprietaireRepository proprietaireRepository;
    private VehiculeRepository vehiculeRepository;


    @WebMethod
    public List<Vehicule> vehicules(){
        return vehiculeRepository.findAll();
    }

    @WebMethod
    public Vehicule vehiculeById(@WebParam(name = "id") Long id){
        Vehicule vehicule = vehiculeRepository.findById(id).get();
        return vehicule;
    }

    @WebMethod
    public List<Proprietaire> proprietaires(){
        return proprietaireRepository.findAll();
    }

    @WebMethod
    public Proprietaire proprietaireById(@WebParam(name = "id") Long id){
        Proprietaire proprietaire = proprietaireRepository.findById(id).get();
        return proprietaire;
    }
}
