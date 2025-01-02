package com.desafio.DesafioLoan.dto;

import java.util.List;

public record CustomerResponse(String customer, List<LoanResponse> loans) {
}