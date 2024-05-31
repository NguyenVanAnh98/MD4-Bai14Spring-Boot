package com.example.md4_bai15springboot.repository;

import com.example.md4_bai15springboot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
