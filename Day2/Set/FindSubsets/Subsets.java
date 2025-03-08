package Day2.Set.FindSubsets;



import java.util.HashSet;


public class Subsets {
   //Method for check Subsets
   public static void subsets(HashSet<Integer> hs1,HashSet<Integer> hs2){
      int count=0;
       for(int ele: hs1){
          if(hs2.contains(ele)){
              count++;
          }
      }
       System.out.println("First is a subset of another "+(count== hs1.size()));
   }
   //Main Method
   public static void main(String[] args) {
       HashSet<Integer> hs1=new HashSet<>();
       hs1.add(2);
       hs1.add(3);
       HashSet<Integer> hs2=new HashSet<>();
       hs2.add(1);
       hs2.add(2);
       hs2.add(3);
       hs2.add(4);
       subsets(hs1,hs2);
   }
}
