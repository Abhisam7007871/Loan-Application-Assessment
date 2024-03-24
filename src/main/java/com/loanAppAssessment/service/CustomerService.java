package com.loanAppAssessment.service;

import com.loanAppAssessment.entity.Customer;
import com.loanAppAssessment.entity.Result;
import com.loanAppAssessment.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    public Result createCustomer(String name, String email, String contact, Long amount, int term, String date) {
        Customer customer = new Customer(name, email, contact, amount, term, date);
        Customer existingCustomer = customerRepository.findByEmailOrContact(email, contact);
        Result result = new Result();
        if(Objects.nonNull(existingCustomer)){
            result.setSuccess(false);
            result.setMessage("Customer data already exists!!!");
            return result;
        }

        //assigning current date if user does not enter the date
        if(date.equalsIgnoreCase("000")){
            LocalDateTime localDateTime = LocalDateTime.now();
            customer.setDate(String.valueOf(localDateTime));
        }
        Customer saveResult = customerRepository.save(customer);
        result.setSuccess(true);
        result.setMessage("Customer detail Saved!!");
        return result;
    }
}
