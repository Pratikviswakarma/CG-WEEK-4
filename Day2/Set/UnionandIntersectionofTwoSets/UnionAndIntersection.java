package Day2.Set.UnionandIntersectionofTwoSets;

import java.util.HashSet;


public class UnionAndIntersection {
   //Method to Find union and intersection
   public static void unionAndIntersection(HashSet<Integer> hs1,HashSet<Integer>hs2){
       HashSet<Integer> hs=new HashSet<>();
       for(int ele: hs1){
           hs.add(ele);
       }
       for(int ele: hs2){
           hs.add(ele);
       }
       System.out.println("Union is "+hs);


      hs1.retainAll(hs2);
       System.out.println("Intersection "+hs1);
   }
   //Main method
   public static void main(String[] args) {
       HashSet<Integer> hs1=new HashSet<>();
       hs1.add(1);
       hs1.add(2);
       hs1.add(3);
       HashSet<Integer> hs2=new HashSet<>();
       hs2.add(3);
       hs2.add(4);
       hs2.add(5);
       unionAndIntersection(hs1,hs2);
   }
}
