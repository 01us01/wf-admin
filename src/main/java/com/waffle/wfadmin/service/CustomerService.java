package com.waffle.wfadmin.service;

import com.waffle.wfadmin.dto.CustomerDto;
import com.waffle.wfadmin.dto.mapper.CustomerMapper;
import com.waffle.wfadmin.entity.Customer;
import com.waffle.wfadmin.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;
    private final CustomerMapper mapper;

    public CustomerDto.Response createCustomer(CustomerDto.Request request) {

        Customer customer = mapper.toEntity(request);
        customer.setRegDate(LocalDateTime.now());

        return mapper.toResponseDto(repository.save(customer));
    }
    public List<Customer> getCustomer() {
        return repository.findAll();
    }
}
