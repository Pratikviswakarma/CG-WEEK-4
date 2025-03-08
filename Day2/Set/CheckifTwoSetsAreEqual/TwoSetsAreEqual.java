package Day2.Set.CheckifTwoSetsAreEqual;



import java.util.HashSet;

public class TwoSetsAreEqual {
   //Method for checking two sets are equal or not
   public static void isEquals(HashSet<Integer> hs1,HashSet<Integer> hs2){
       System.out.println("Both are Equals "+hs1.equals(hs2));
   }


   //Main method
   public static void main(String[] args) {
       HashSet<Integer> hs1=new HashSet<>();
       hs1.add(1);
       hs1.add(2);
       hs1.add(3);
       HashSet<Integer> hs2=new HashSet<>();
       hs2.add(3);
       hs2.add(2);
       hs2.add(1);
       isEquals(hs1,hs2);
   }
}


