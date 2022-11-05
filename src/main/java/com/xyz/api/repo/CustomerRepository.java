package com.xyz.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyz.api.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
