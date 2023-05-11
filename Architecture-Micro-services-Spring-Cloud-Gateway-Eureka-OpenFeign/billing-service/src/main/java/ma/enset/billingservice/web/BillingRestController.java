package ma.enset.billingservice.web;

import ma.enset.billingservice.entities.Bill;
import ma.enset.billingservice.feign.CustomerRestClient;
import ma.enset.billingservice.feign.ProductItemRestClient;
import ma.enset.billingservice.model.Customer;
import ma.enset.billingservice.model.Product;
import ma.enset.billingservice.repositories.BillRepository;
import ma.enset.billingservice.repositories.ProductItemRepository;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingRestController {
    private BillRepository billRepository;
    private CustomerRestClient customerRestClient;
    private ProductItemRestClient productItemRestClient;
    private ProductItemRepository productItemRepository;

    public BillingRestController(BillRepository billRepository, CustomerRestClient customerRestClient, ProductItemRestClient productItemRestClient, ProductItemRepository productItemRepository) {
        this.billRepository = billRepository;
        this.customerRestClient = customerRestClient;
        this.productItemRestClient = productItemRestClient;
        this.productItemRepository = productItemRepository;
    }
    @GetMapping(path = "/fullBill/{id}")
    public Bill getBill(@PathVariable(name = "id") Long id){
        Bill bill=billRepository.findById(id).get();
        Customer customer=customerRestClient.getCustomerByID(bill.getCustomerID());
        bill.setCustomer(customer);
        bill.getProductItems().forEach(pi->{
            Product product= productItemRestClient.getProductByID(pi.getProductID()).getProduct();
        //pi.setProduct(product);
        pi.setProductName(product.getName());
    });
        return bill;

    }

}
