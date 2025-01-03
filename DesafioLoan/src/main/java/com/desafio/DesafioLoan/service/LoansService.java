package com.desafio.DesafioLoan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.desafio.DesafioLoan.dto.CustomerLoanRequest;
import com.desafio.DesafioLoan.dto.CustomerResponse;
import com.desafio.DesafioLoan.dto.LoanResponse;
import com.desafio.DesafioLoan.enums.LoanType;

import com.desafio.DesafioLoan.model.Loan;

@Service
public class LoansService {
     
    
    public CustomerResponse checkLoanAvailability(CustomerLoanRequest loanRequest){
        
        var customer = loanRequest.toCustomer();
        var loan = new Loan(customer);

        List<LoanResponse> loans = new ArrayList<>();

        if(loan.isPersonalLoanAvailable()){
            loans.add(new LoanResponse(LoanType.PERSONAL, loan.getPersonalInterestRate()));
        }

        if(loan.isConsignmentLoanAvailable()){
            loans.add(new LoanResponse(LoanType.CONSIGNMENT, loan.getConsignmentInterestRate()));
        }

        if(loan.isGuaranteedLoanAvailable()){
            loans.add(new LoanResponse(LoanType.GUARANTEED, loan.getGuaranteedInterestRate()));
        }
        
        return new CustomerResponse(customer.toString(), loans);
    }
}