package com.desafio.DesafioLoan.model;

import com.desafio.DesafioLoan.exceptions.LoanNotAvailableException;

public class Loan {

    private Customer customer;

    public Loan(Customer customer) {
        this.customer = customer;
    }

    public boolean isPersonalLoanAvailable(){
        if(customer.isIncomeEqualsOrUnder(3000)){
            return true;
        }

        return customer.isIncomeBetween(3000, 5000) && customer.isAgeUnder(30) 
                && customer.isLocation("SP");
    }

    public double getPersonalInterestRate(){
        if(isPersonalLoanAvailable()){
            return 4.0;
        }
        throw new LoanNotAvailableException("O emprestimo pessoal nao esta disponivel");
    }
}