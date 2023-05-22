package ma.enset.immatriculation_service.web.soap;

import lombok.AllArgsConstructor;
import ma.enset.immatriculation_service.web.soap.ImmatriculationSoapService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CXFSoapWebServiceConfig {
    @Autowired
    private Bus bus;
    @Autowired
    private ImmatriculationSoapService immatriculationSoapService;

    @Bean
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, immatriculationSoapService);
        endpoint.publish("/ImmatriculationService");
        return endpoint;
    }
}