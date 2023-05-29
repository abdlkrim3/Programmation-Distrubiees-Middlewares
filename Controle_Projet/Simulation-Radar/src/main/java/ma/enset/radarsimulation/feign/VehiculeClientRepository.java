package ma.enset.radarsimulation.feign;

import ma.enset.radarsimulation.models.Vehicule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "IMMATRICULATION-SERVICE")
public interface VehiculeClientRepository {
    @GetMapping("/vehicules")
    List<Vehicule> getVehicules();
}
