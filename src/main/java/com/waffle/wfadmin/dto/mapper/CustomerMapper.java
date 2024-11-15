package com.waffle.wfadmin.dto.mapper;

import com.waffle.wfadmin.dto.CustomerDto;
import com.waffle.wfadmin.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer toEntity(CustomerDto.Request request);
    CustomerDto.Request toRequestDto(Customer customer);
    CustomerDto.Response toResponseDto(Customer customer);
}
