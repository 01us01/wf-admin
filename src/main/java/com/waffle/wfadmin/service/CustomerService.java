package com.waffle.wfadmin.service;

import com.waffle.wfadmin.entity.Customer;
import com.waffle.wfadmin.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;

    public List<Customer> getCustomer() {
        return repository.findAll();
    }
}
