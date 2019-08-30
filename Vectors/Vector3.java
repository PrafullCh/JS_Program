 import java.util.*;
 class Sample{
 	int a;
 	Sample()
 	{
 		a=6;
 	}
 	void show()
 	{
 		System.out.println("Object of Sample \na="+a);
 	}
 }

 class Vector3{
	public static void main(String[] a) {
		//Vector v = new Vector();
		Vector v = new Vector(18);
		//v.addElement(new Integer(5));
		//System.out.println((Integer)v.elementAt(0));
		v.addElement(new Sample());
		((Sample)v.elementAt(0)).show();
	}
}