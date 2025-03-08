package Day2.InsurancePolicyManagementSystem2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class BankingSystem {
    private HashMap<String, Double> accounts = new HashMap<>();
    private TreeMap<Double, String> sortedByBalance = new TreeMap<>();
    private Queue<String> withdrawalQueue = new LinkedList<>();
 
 
    public void addAccount(String accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedByBalance.put(balance, accountNumber);
    }
 
 
    public void withdraw(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount) {
            withdrawalQueue.add(accountNumber);
        }
    }
 
 
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for: " + accountNumber);
        }
    }
 
 
    public Map<Double, String> getAccountsSortedByBalance() {
        return sortedByBalance;
    }
 }
 
 