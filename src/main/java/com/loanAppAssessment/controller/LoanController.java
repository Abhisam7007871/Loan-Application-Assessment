package com.loanAppAssessment.controller;


import com.loanAppAssessment.entity.Result;
import com.loanAppAssessment.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping("/createLoan")
    public Result createLoan(    Long amount,
                                    int term,
                                    String contact
                                    ){
        return loanService.createLoan(amount,term,contact);
    }

}
