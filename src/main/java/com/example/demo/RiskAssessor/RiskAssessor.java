package com.example.demo.RiskAssessor;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;

@Component
public class RiskAssessor {

    private static final double RISK_THRESHOLD = 1000.0;

    public boolean assessRisk(double transactionAmount) {
        if (transactionAmount > RISK_THRESHOLD) {
            return true; // Transaction is considered risky
        } else {
            return false; // Transaction is considered safe
        }
    }
}

