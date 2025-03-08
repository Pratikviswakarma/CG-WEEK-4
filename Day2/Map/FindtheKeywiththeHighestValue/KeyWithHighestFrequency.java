package Day2.Map.FindtheKeywiththeHighestValue;



import java.util.HashMap;
import java.util.Map;


public class KeyWithHighestFrequency {
   //Method to find highest frequency
   public static void higestFequency(HashMap<String,Integer> hm){
       int highest=0;
       String key="";
       for(Map.Entry<String,Integer> map: hm.entrySet()){
           if(highest<map.getValue()){
               highest= map.getValue();
               key=map.getKey();
           }
       }
       System.out.println(key);
   }
   //Main method
   public static void main(String[] args) {
       HashMap<String,Integer> hm=new HashMap<>();
       hm.put("A",10);
       hm.put("B",20);
       hm.put("C",15);
       higestFequency(hm);
   }
}
