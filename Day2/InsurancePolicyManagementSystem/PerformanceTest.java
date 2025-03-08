package Day2.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class PerformanceTest {
    public static void main(String[] args) {
        InsurancePolicyManagement manager = new InsurancePolicyManagement();
        Random random = new Random();
 
 
        // Generate test policies
        List<Policy> policies = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            policies.add(new Policy(
                    "P" + i,
                    "Holder" + i,
                    LocalDate.now().plusDays(random.nextInt(365)),
                    i % 2 == 0 ? "Health" : "Auto",
                    random.nextDouble() * 1000
            ));
        }
 
 
        // Performance Test: Add Policies
        long start = System.nanoTime();
        policies.forEach(manager::addPolicy);
        long end = System.nanoTime();
        System.out.println("Time to add policies: " + (end - start) / 1e6 + " ms");
 
 
        // Performance Test: Search Policies by Coverage Type
        start = System.nanoTime();
        manager.getPoliciesByCoverageType("Health");
        end = System.nanoTime();
        System.out.println("Time to search policies: " + (end - start) / 1e6 + " ms");
 
 
        // Performance Test: Remove Policies
        start = System.nanoTime();
        policies.forEach(manager.getAllPolicies()::remove);
        end = System.nanoTime();
        System.out.println("Time to remove policies: " + (end - start) / 1e6 + " ms");
    }
 }
 
