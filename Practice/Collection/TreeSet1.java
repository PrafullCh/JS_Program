import java.util.*;
public class TreeSet1{
    public static void main(String[] args)
    {
        TreeSet<Integer> ts = new <Integer>TreeSet();
        for(int i = 50 ; i>=41 ; i--)
            ts.add(i);
        Iterator it = ts.iterator();
        while(it.hasNext())
        System.out.println(it.next());
        System.out.println("highest(45) : "+ts.higher(45));
        System.out.println("ceiling(45) : "+ts.ceiling(45));
        System.out.println("lower(45) : "+ts.lower(45));
        System.out.println("floor(45) : "+ts.floor(45));
    }
}