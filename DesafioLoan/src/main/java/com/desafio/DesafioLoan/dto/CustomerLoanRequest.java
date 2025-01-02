package com.desafio.DesafioLoan.dto;

import com.desafio.DesafioLoan.model.Customer;

public record CustomerLoanRequest(Integer age,
                        String cpf,
                        String name,
                        Double income,
                        String location) {
    
    public Customer toCustomer(){
        return new Customer(age, cpf, name, income, location);
    }
}