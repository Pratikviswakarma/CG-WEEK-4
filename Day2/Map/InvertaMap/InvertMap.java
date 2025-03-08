package Day2.Map.InvertaMap;

import java.util.*;


public class InvertMap {
   // Method to invert a map
   public static <K, V> Map<V, List<K>> invertMap(Map<K, V> inputMap) {
       Map<V, List<K>> invertedMap = new HashMap<>();


       for (Map.Entry<K, V> entry : inputMap.entrySet()) {
           V value = entry.getValue();
           K key = entry.getKey();
           invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
       }


       return invertedMap;
   }


   public static void main(String[] args) {
       // Example input map
       Map<String, Integer> inputMap = new HashMap<>();
       inputMap.put("A", 1);
       inputMap.put("B", 2);
       inputMap.put("C", 1);


       // Inverting the map
       Map<Integer, List<String>> invertedMap = invertMap(inputMap);
      
       System.out.println(invertedMap);
   }
}
