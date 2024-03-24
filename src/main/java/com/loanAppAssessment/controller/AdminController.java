package com.loanAppAssessment.controller;

import com.loanAppAssessment.entity.Admin;
import com.loanAppAssessment.entity.Result;
import com.loanAppAssessment.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/createAdmin")
    public Result createAdmin(String name,
                              String email,
                              String contact){
        return adminService.createAdmin(name, email, contact);
    }

    @GetMapping("/getAdmin")
    public Result getAdmin(String contact){
        return adminService.getAdmin(contact);
    }

}
