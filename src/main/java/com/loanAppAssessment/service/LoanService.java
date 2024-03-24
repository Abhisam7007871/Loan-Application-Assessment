package com.loanAppAssessment.service;

import com.loanAppAssessment.entity.Loan;
import com.loanAppAssessment.entity.Result;

public class LoanService {
    public Result createLoan(Long amount, int term, String contact) {
        Loan loan = new Loan(amount,term,contact);
        Result result = new Result()
    }
}
