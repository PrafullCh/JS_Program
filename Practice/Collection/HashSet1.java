import java.util.*;

public class HashSet1{
    public static void main(String[] args)
    {
        HashSet<Integer> hs = new <Integer>HashSet();
        for(int i=11;i<=20;i++)
            hs.add(i);
        Iterator it = hs.iterator();
        while(it.hasNext())
            System.out.print(it.next()+"\t");
        System.out.println("\nDoes it contain 11 ? t/f : "+hs.contains(11)+"\nDoes it contains 5 : "+hs.contains(05));
        System.out.println("\nHash code for given set is "+hs.hashCode());
        System.out.println("Is it empty "+hs.isEmpty());
        System.out.println("Size "+hs.size());
        System.out.println("After removing ");
        hs.remove(15);
        System.out.println("Size "+hs.size());
    }
}