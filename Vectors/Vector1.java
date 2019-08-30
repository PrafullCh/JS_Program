 import java.util.*;
 

 class Vector1{
	public static void main(String[] a) {
		//Vector v = new Vector();
		Vector v = new Vector(18);
		v.addElement(new Integer(5));
		System.out.println((Integer)v.elementAt(0));
	}
}