package Day2.InsurancePolicyManagementSystem2;

import java.time.LocalDate;

class Policy {
    String policyNumber;
    String policyholderName;
    LocalDate expiryDate;
 
 
    public Policy(String policyNumber, String policyholderName, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
    }
 
 
    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholderName='" + policyholderName + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
 }
 
 
 