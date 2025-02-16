package cacheresult;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheHandler {
    private static final Map<String, Object> cache = new HashMap<>();

    public static void main(String[] args) {
        ExpensiveService service = new ExpensiveService();
        invokeWithCache(service, "computeFactorial", 5);
        invokeWithCache(service, "computeFactorial", 5); // Should return cached result
        invokeWithCache(service, "computeFactorial", 6);
    }

    private static void invokeWithCache(Object obj, String methodName, int param) {
        try {
            Method method = obj.getClass().getDeclaredMethod(methodName, int.class);
            String cacheKey = methodName + "(" + param + ")";

            if (method.isAnnotationPresent(CacheResult.class) && cache.containsKey(cacheKey)) {
                System.out.println("Returning cached result for: " + param);
                System.out.println("Result: " + cache.get(cacheKey));
                return;
            }

            Object result = method.invoke(obj, param);
            cache.put(cacheKey, result);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

