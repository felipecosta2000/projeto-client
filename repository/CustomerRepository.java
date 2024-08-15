package com.felipe.costa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.costa.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}

