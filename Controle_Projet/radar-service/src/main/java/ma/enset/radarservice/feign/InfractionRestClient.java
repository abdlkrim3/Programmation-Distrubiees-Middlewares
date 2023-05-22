package ma.enset.radarservice.feign;

import ma.enset.radarservice.models.Infraction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@FeignClient(name = "INFRACTION-SERVICE")
public interface InfractionRestClient {
    @PostMapping("/infractions")
    Infraction save(@RequestBody Infraction infraction);
}
