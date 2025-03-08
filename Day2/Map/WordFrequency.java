package Day2.Map;



import java.util.HashMap;


public class WordFrequency {
   //Method for count word frequency
   public static void wordFrequency(String str){
       HashMap<String,Integer> hm=new HashMap<>();
       String[] temp=str.split("\\W");
       for(int i=0;i<temp.length;i++){
           if(hm.containsKey(temp[i])){
               hm.put(temp[i],hm.getOrDefault(temp[i],0)+1);
           }else{
               hm.put(temp[i],1);
           }
       }
       System.out.println(hm);
   }
   //Main method
   public static void main(String[] args) {
       String str="hello world,hello java!";
       wordFrequency(str);
   }
}
