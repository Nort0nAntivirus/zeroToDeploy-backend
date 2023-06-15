package com.live.zero.to.deploy.service;

import com.live.zero.to.deploy.model.Customer;
import com.live.zero.to.deploy.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private final CustomerRepository repository;

    public CustomerService(final CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer insert (final Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> listAll() {
        return repository.findAll();
    }
}
