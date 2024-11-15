package com.waffle.wfadmin.controller;

import com.waffle.wfadmin.dto.CustomerDto;
import com.waffle.wfadmin.entity.Customer;
import com.waffle.wfadmin.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/api/customer"))
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("")
    public ResponseEntity<CustomerDto.Response> insertCustomer(@RequestBody CustomerDto.Request request) {

        CustomerDto.Response customer = customerService.createCustomer(request);
        return ResponseEntity.ok().body(customer);
    }

    @GetMapping("")
    public ResponseEntity<List<Customer>> getCustomer() {

        List<Customer> customer = customerService.getCustomer();
        return ResponseEntity.ok().body(customer);
    }
}
