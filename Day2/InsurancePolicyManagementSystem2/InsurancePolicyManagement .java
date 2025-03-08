package Day2.InsurancePolicyManagementSystem2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

class InsurancePolicyManagement {
   private HashMap<String, Policy> policies = new HashMap<>();
   private LinkedHashMap<String, Policy> orderedPolicies = new LinkedHashMap<>();
   private TreeMap<LocalDate, Policy> sortedByExpiry = new TreeMap<>();


   public void addPolicy(Policy policy) {
       policies.put(policy.policyNumber, policy);
       orderedPolicies.put(policy.policyNumber, policy);
       sortedByExpiry.put(policy.expiryDate, policy);
   }


   public Policy getPolicy(String policyNumber) {
       return policies.get(policyNumber);
   }


   public List<Policy> getExpiringPolicies(int days) {
       LocalDate today = LocalDate.now();
       LocalDate cutoff = today.plusDays(days);
       return new ArrayList<>(sortedByExpiry.subMap(today, cutoff).values());
   }


   public List<Policy> getPoliciesByHolder(String name) {
       List<Policy> result = new ArrayList<>();
       for (Policy policy : policies.values()) {
           if (policy.policyholderName.equals(name)) {
               result.add(policy);
           }
       }
       return result;
   }


   public void removeExpiredPolicies() {
       LocalDate today = LocalDate.now();
       sortedByExpiry.headMap(today, true).clear();
       policies.values().removeIf(policy -> policy.expiryDate.isBefore(today));
       orderedPolicies.values().removeIf(policy -> policy.expiryDate.isBefore(today));
   }
}
