import java.util.*;

public class ArrayList1{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new <Integer>ArrayList();
        ArrayList<Integer> al1 = new <Integer>ArrayList();
        al.add(12);
        for(int i=10;i<20;i++)
            al1.add(i);
        al.addAll(al1);
        for(Integer i : al)
            System.out.println(i);
        System.out.println("index of 4 is "+al.indexOf(14));
        System.out.println("index of 4 is "+al.lastIndexOf(14));
        ListIterator li = al.listIterator();
        System.out.println("listiterator");
        while(li.hasNext())
            System.out.println((Integer)li.next());
        al.replaceAll((Integer e)->{
                return e+5;
                //System.out.print(al.get(i)+"\t");
        });
        al.set(0,100);
        al.remove(new Integer(15));
        for(Integer i : al)
            System.out.println("added 5 "+i);
    }
}    