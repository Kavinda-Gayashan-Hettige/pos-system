package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.dto.CustomerDto;
import edu.icet.ecom.model.entity.Customer;
import edu.icet.ecom.repository.CustomerRepository;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    final CustomerRepository repository;
    final ModelMapper mapper;
    @Override
    public void AddCustomer(CustomerDto customer) {
        repository.save(mapper.map(customer, Customer.class));
    }

    @Override
    public List<CustomerDto> getAll() {
        List<CustomerDto> customerList = new ArrayList<>();
        List<Customer> all = repository.findAll();

        all.forEach(customerEntity -> {
            customerList.add(mapper.map(customerEntity, CustomerDto.class));
        });

        return customerList;
    }

    @Override
    public void deleteCustomer(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateCustomer(CustomerDto customer) {
        repository.save(mapper.map(customer, Customer.class));
    }

    @Override
    public CustomerDto searchById(Integer id) {
        return mapper.map(repository.findById(id), CustomerDto.class);
    }

    @Override
    public List<CustomerDto> searchByName(String name) {
        List<Customer> byName = repository.findByName(name);
        List<CustomerDto> customerList = new ArrayList<>();

        byName.forEach(customerEntity -> {
            customerList.add(mapper.map(customerEntity, CustomerDto.class));
        });
        return customerList;
    }
}
