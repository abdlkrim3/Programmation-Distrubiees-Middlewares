package ma.enset.infractionsservice.feign;

import ma.enset.infractionsservice.model.Proprietaire;
import ma.enset.infractionsservice.model.Vehicule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="IMMATRICULATION-SERVICE")
public interface ImmatriculationRestClient {

    @GetMapping("/proprietaires/{id}")
    Proprietaire getProprietaireById(@RequestParam Long id);
    @GetMapping("/vehicules/{id}")
    Vehicule getVehiculeById(@PathVariable Long id);
    @GetMapping("/vehicule")
    Vehicule getVehiculeByMarticule(@RequestParam String mat);
    @GetMapping("/proprietaires")
    PagedModel<Proprietaire> pageProprietaire(@RequestParam(name = "page") int page, @RequestParam(name = "size") int size);
}
