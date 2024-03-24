package com.loanAppAssessment.service;

import com.loanAppAssessment.entity.Admin;
import com.loanAppAssessment.entity.Customer;
import com.loanAppAssessment.entity.Result;
import com.loanAppAssessment.repo.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;
    public Result createAdmin(String name, String email, String contact) {
        Admin admin = new Admin(name, email,contact);
        Admin existingAdmin = adminRepository.findByEmailOrContact(email,contact);
        Result result = new Result();
        if(Objects.nonNull(existingAdmin)){
            result.setSuccess(false);
            result.setMessage("Admin data already exists!!!");
            result.setAdmin(existingAdmin);
            return result;
        }
        adminRepository.save(admin);
        result.setSuccess(true);
        result.setMessage("Admin Data Saved !!!");
        result.setAdmin(admin);
        return result;

    }

    public Result getAdmin(String contact) {
        Admin admin = adminRepository.findByContact(contact);
        Result result = new Result();
        if(Objects.nonNull(admin)){
            result.setSuccess(true);
            result.setMessage("Admin Data Found!!!");
            result.setAdmin(admin);
            return result;
        }
        result.setSuccess(false);
        result.setMessage("Admin not found");
        return result;


    }
}
