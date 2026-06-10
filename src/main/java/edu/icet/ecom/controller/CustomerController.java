package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.CustomerDto;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/get-all")
    public List<CustomerDto> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        service.deleteCustomer(id);
    }

    @PutMapping("/update-customer")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateCustomer(@RequestBody CustomerDto customer){
        service.updateCustomer(customer);
    }
    @GetMapping("/search-by-id/{id}")
    public CustomerDto searchById(@PathVariable Integer id){
        return service.searchById(id);
    }

    @GetMapping("/search-by-name/{name}")
    public List<CustomerDto> searchByName(@PathVariable String name){
        return service.searchByName(name);
    }
}
