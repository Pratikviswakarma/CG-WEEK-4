package Day2.Set.ConvertaSettoaSortedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class SortedList {
   //Method for SortedList
   public static void sortedList(HashSet<Integer> hs){
       ArrayList<Integer> al=new ArrayList<>();
       al.addAll(hs);
       Collections.sort(al);
       System.out.println(al);
   }
   //Main method
   public static void main(String[] args) {
       HashSet<Integer> hs=new HashSet<>();
       hs.add(5);
       hs.add(3);
       hs.add(9);
       hs.add(1);
       sortedList(hs);
   }
}

