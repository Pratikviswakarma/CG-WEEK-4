package Day2.Set.SymmetricDifference;

import java.util.HashSet;


public class SymmetricDifference {
   //Method for Symmetric Difference
   public static void symmetricDiffernce(HashSet<Integer> hs1,HashSet<Integer> hs2){
     HashSet<Integer> hs=new HashSet<>();
     for(int ele: hs1){
         if(hs1.contains(ele) && !hs2.contains(ele))
         {
             hs.add(ele);
         }
     }
       for(int ele: hs2){
           if(hs2.contains(ele) && !hs1.contains(ele))
           {
               hs.add(ele);
           }
       }
       System.out.println(hs);
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
       symmetricDiffernce(hs1,hs2);
   }
}

