package com.waffle.wfadmin.repository;

import com.waffle.wfadmin.entity.AdminUser;
import com.waffle.wfadmin.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
