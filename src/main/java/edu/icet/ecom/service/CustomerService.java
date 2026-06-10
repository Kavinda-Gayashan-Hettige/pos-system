package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    void AddCustomer(CustomerDto customer);

    List<CustomerDto> getAll();

    void deleteCustomer(Integer id);

    void updateCustomer(CustomerDto customer);

    CustomerDto searchById(Integer id);

    List<CustomerDto> searchByName(String name);
}
