package com.loanAppAssessment.repo;

import com.loanAppAssessment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findByEmailOrContact(String email, String contact);

}
