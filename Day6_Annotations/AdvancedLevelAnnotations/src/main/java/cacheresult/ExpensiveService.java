package cacheresult;

import java.util.HashMap;
import java.util.Map;

public class ExpensiveService {

    private static final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int computeFactorial(int num) {
        if (cache.containsKey(num)) {
            System.out.println("Returning cached result for: " + num);
            return cache.get(num);
        }
        System.out.println("Computing factorial for: " + num);
        int result = factorial(num);
        cache.put(num, result);
        return result;
    }

    private int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
}

