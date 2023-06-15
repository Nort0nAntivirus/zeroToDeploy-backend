package com.live.zero.to.deploy.controller;

import com.live.zero.to.deploy.core.IdDto;
import com.live.zero.to.deploy.model.Customer;
import com.live.zero.to.deploy.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@Valid
public class CustomerController {

    private final CustomerService service;

    @Autowired
    public CustomerController(final CustomerService service) {
        this.service = service;
    }

    @PostMapping
    private ResponseEntity<?> insert(@RequestBody final Customer customer) {
        final var response = service.insert(customer);
        return ResponseEntity.ok(new IdDto(response.getId()));
    }

    @GetMapping
    private ResponseEntity<?> listAll() {
        return ResponseEntity.ok(service.listAll());
    }
}
