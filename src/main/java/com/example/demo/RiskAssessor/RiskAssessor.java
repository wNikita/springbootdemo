package com.example.demo.RiskAssessor;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;

@Component
public class RiskAssessor {

    // A predefined risk threshold (you can adjust this based on your needs)
    private static final double RISK_THRESHOLD = 1000.0;

    public boolean assessRisk(double transactionAmount) {
        // Assess the risk based on the transaction amount
        if (transactionAmount > RISK_THRESHOLD) {
            return true; // Transaction is considered risky
        } else {
            return false; // Transaction is considered safe
        }
    }
}

