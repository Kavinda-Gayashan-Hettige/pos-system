package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.CustomerDto;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    final CustomerService service ;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void AddCustomer(@RequestBody CustomerDto customer){
        service.AddCustomer(customer);
        System.out.println(customer);
    }
}
