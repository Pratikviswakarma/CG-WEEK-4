package Day2.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.Objects;

class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;
 
 
    public Policy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }
 
 
    public String getPolicyNumber() { return policyNumber; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }
 
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Policy)) return false;
        Policy other = (Policy) obj;
        return policyNumber.equals(other.policyNumber);
    }
 
 
    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }
 
 
    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }
 
 
    @Override
    public String toString() {
        return "Policy{" +
                "PolicyNumber='" + policyNumber + '\'' +
                ", Holder='" + policyholderName + '\'' +
                ", Expiry=" + expiryDate +
                ", Type='" + coverageType + '\'' +
                ", Premium=" + premiumAmount +
                '}';
    }
 }
 