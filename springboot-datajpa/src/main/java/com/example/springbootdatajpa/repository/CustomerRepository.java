package com.example.springbootdatajpa.repository;

import com.example.springbootdatajpa.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ratneshc
 *
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>
{
    Customer findByUsername(String username);
}
