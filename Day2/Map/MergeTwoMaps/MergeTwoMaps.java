package Day2.Map.MergeTwoMaps;



import java.util.HashMap;
import java.util.*;


public class MergeTwoMaps {
   // Method to merge two maps with sum of values for duplicate keys
    public static void mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
       Map<String, Integer> mergedMap = new HashMap<>(map1);


       for (Map.Entry<String, Integer> entry : map2.entrySet()) {
           mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
       }


        System.out.println(mergedMap);
   }


   public static void main(String[] args) {
       // Example maps
       Map<String, Integer> map1 = new HashMap<>();
       map1.put("A", 1);
       map1.put("B", 2);


       Map<String, Integer> map2 = new HashMap<>();
       map2.put("B", 3);
       map2.put("C", 4);
       mergeMaps(map1,map2);
   }
}


