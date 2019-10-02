import java.util.*;

public class TreeMap1{
    public static void main(String[] args)
    {
        LinkedHashMap<String,Integer> tm = new <String,Integer>LinkedHashMap();
        
        tm.put("prafull",176110);
        tm.put("abc",176111);
        tm.put("xyz",176112);
        tm.put("pqr",176112);
        
        
        Set<Map.Entry<String,Integer>> s = tm.entrySet();
        
        for(Map.Entry<String,Integer> i: s)
        {
            System.out.print(i.getKey()+":");
            System.out.println(i.getValue());
        }
    }
}