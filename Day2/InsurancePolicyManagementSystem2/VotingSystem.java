package Day2.InsurancePolicyManagementSystem2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class VotingSystem {
    private HashMap<String, Integer> votes = new HashMap<>();
    private LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();
    private TreeMap<String, Integer> sortedResults = new TreeMap<>();
 
 
    public void vote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, votes.get(candidate));
        sortedResults.put(candidate, votes.get(candidate));
    }
 
 
    public Map<String, Integer> getVoteResults() {
        return sortedResults.descendingMap();
    }
 
 
    public Map<String, Integer> getVoteOrder() {
        return voteOrder;
    }
 }
 
 
 
 
 