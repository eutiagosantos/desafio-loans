package com.desafio.DesafioLoan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.DesafioLoan.dto.CustomerLoanRequest;
import com.desafio.DesafioLoan.dto.CustomerResponse;
import com.desafio.DesafioLoan.service.LoansService;

import jakarta.validation.Valid;

@RestController
public class LoansController {
    
    @Autowired
    private LoansService loansService;


    @PostMapping(value = "/customer-loans")
    public ResponseEntity<CustomerResponse> customerLoans(@RequestBody @Valid CustomerLoanRequest request){
        
        var response = loansService.checkLoanAvailability(request);

        return ResponseEntity.ok(response);
    } 
}