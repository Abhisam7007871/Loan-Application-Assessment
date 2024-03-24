package com.loanAppAssessment.controller;

import com.loanAppAssessment.entity.Customer;
import com.loanAppAssessment.entity.Result;
import com.loanAppAssessment.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping(value = "/createCustomer")
    public Result createCustomer(String name,
                                 String email,
                                 String contact){
        return customerService.createCustomer(name, email, contact);
    }

    @GetMapping("/getCustomer")
    public Result getCustomer(String contact){
        return customerService.getCustomer(contact);
    }

}
