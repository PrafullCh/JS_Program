import java.util.*;
 

public class HashMap1{
    public static void main(String args[])
    {
        Set<Map.Entry<String,Integer>> s;
        HashMap<String,Integer> hs = new <String,Integer>HashMap();
        HashMap<String,Integer> hs2 = new <String,Integer>HashMap();
        hs.put("prafull",176110);
        hs.put("saurabh",176103);
        hs2.put("prafull",176110);
        hs2.put("saurabh",176103);
        
        
        System.out.println("Roll No of prafull is "+hs.get("prafull"));
        System.out.println("First key is "+hs.firstKey());
        
        
        s = hs.entrySet();
        for(Map.Entry<String,Integer> i : s)
        {
            System.out.print(i.getKey()+":");
            System.out.println(i.getValue());
        }
        
        hs.clear();
        
        System.out.println("Both are aqual ?"+hs.equals(hs2));
        
        System.out.println("After clearing");
        
        System.out.println("Does it contain prafull now ? "+hs.containsKey("prafull"));
        
        hs.put("aniket",176113);
        hs.put("kunal",176118);
        hs.put("karan",176126);
        
        
         s = hs.entrySet();
        
        for(Map.Entry<String,Integer> i : s)
        {
            System.out.print(i.getKey()+":");
            System.out.println(i.getValue());
        }
    }
}