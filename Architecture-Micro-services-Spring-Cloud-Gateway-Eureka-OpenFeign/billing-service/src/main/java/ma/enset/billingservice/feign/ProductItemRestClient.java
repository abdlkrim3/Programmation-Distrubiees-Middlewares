package ma.enset.billingservice.feign;

import ma.enset.billingservice.entities.ProductItem;
import ma.enset.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductItemRestClient {
    @GetMapping(path = "/products")
    PagedModel<Product> pageProducts(/*@RequestParam(name = "page") int page,@RequestParam(name = "size") int size*/);

    @GetMapping(path = "/products/{id}")
    public ProductItem getProductByID(@PathVariable(name = "id") Long id);
}
