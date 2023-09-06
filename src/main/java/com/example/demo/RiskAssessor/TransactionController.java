package com.example.demo.RiskAssessor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    private RiskAssessor riskAssessor;

    @PostMapping("/assess-transaction")
    public String assessTransaction(@RequestBody Double transactionAmount) {
        if (transactionAmount == null) {
            return "Transaction amount is missing or invalid.";
        }

        boolean isRisky = riskAssessor.assessRisk(transactionAmount);

        if (isRisky) {
            return "Transaction is considered risky.";
        } else {
            return "Transaction is considered safe.";
        }
    }
}

