package com.desafio.DesafioLoan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    

    @PostMapping(value = "/customer-loans")
    public ResponseEntity<?> customerLoans(){
        return null;
    } 
}