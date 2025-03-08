package Day2.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class InsurancePolicyManagement {
    private HashSet<Policy> policySet = new HashSet<>();
    private LinkedHashSet<Policy> orderedPolicySet = new LinkedHashSet<>();
    private TreeSet<Policy> sortedPolicySet = new TreeSet<>();
 
 
    public void addPolicy(Policy policy) {
        policySet.add(policy);
        orderedPolicySet.add(policy);
        sortedPolicySet.add(policy);
    }
 
 
    public Set<Policy> getAllPolicies() {
        return new HashSet<>(policySet);
    }
 
 
    public List<Policy> getExpiringSoon(int days) {
        LocalDate today = LocalDate.now();
        LocalDate cutoff = today.plusDays(days);
        return sortedPolicySet.stream()
                .filter(policy -> !policy.getExpiryDate().isAfter(cutoff))
                .toList();
    }
 
 
    public List<Policy> getPoliciesByCoverageType(String coverageType) {
        return policySet.stream()
                .filter(policy -> policy.getCoverageType().equalsIgnoreCase(coverageType))
                .toList();
    }
 
 
    public Set<Policy> findDuplicatePolicies() {
        HashMap<String, Integer> countMap = new HashMap<>();
        Set<Policy> duplicates = new HashSet<>();
        for (Policy policy : policySet) {
            countMap.put(policy.getPolicyNumber(), countMap.getOrDefault(policy.getPolicyNumber(), 0) + 1);
            if (countMap.get(policy.getPolicyNumber()) > 1) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }
 }
 