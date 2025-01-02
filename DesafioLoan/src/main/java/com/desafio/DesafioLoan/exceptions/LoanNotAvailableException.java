package com.desafio.DesafioLoan.exceptions;

public class LoanNotAvailableException extends RuntimeException {
    public LoanNotAvailableException(String message) {
        super(message);
    }
}