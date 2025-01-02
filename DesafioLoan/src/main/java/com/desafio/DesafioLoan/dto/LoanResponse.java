package com.desafio.DesafioLoan.dto;

import com.desafio.DesafioLoan.enums.LoanType;

public record LoanResponse(LoanType type, Double interestRate) {
}