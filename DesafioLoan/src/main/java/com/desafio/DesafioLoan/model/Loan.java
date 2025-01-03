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

    public boolean isConsignmentLoanAvailable(){
        return customer.isIncomeEqualOrUpper(5000);
    }

    public boolean isGuaranteedLoanAvailable(){
        if(customer.isIncomeEqualsOrUnder(3000)){
            return true;
        }

        return customer.isIncomeBetween(3000, 5000)
                && customer.isAgeUnder(30)
                && customer.isLocation("SP");
    }

    public double getGuaranteedInterestRate(){
        if(isGuaranteedLoanAvailable()){
            return 3.0;
        }
        throw new LoanNotAvailableException("O emprestimo de garantia nao esta disponivel");
    }

    public double getConsignmentInterestRate(){
        if(isConsignmentLoanAvailable()){
            return 2.0;
        }
        throw new LoanNotAvailableException("O emprestimo consignado nao esta disponivel");
    }

    public double getPersonalInterestRate(){
        if(isPersonalLoanAvailable()){
            return 4.0;
        }
        throw new LoanNotAvailableException("O emprestimo pessoal nao esta disponivel");
    }
}