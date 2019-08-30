import Sample1.FileFromSample1;
import Sample2.FileFromSample2;
class Program1{
	public static void main(String[] args) {
		FileFromSample1 obj = new FileFromSample1();
		obj.table(2); 
		FileFromSample2 obj1 = new FileFromSample2();
		System.out.print("Square is "+obj1.square(2));
		System.out.print("Cube is "+obj1.cube(2));
	}
}