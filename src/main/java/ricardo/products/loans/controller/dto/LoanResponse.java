package ricardo.products.loans.controller.dto;


import ricardo.products.loans.domain.LoanType;

public record LoanResponse(LoanType type, Double interestRate) {
}