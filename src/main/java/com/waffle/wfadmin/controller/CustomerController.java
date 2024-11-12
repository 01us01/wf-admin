package com.waffle.wfadmin.controller;

import com.waffle.wfadmin.entity.Customer;
import com.waffle.wfadmin.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(("/api/customer"))
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("")
    public ResponseEntity<List<Customer>> getCustomer() {

        List<Customer> customer = customerService.getCustomer();
        return ResponseEntity.ok().body(customer);
    }
}
