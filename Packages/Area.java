package Practice;
import java.util.Scanner;


public class Area implements Circle{
	float radius;
	public void area(){
			float ar;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter radius :");
			radius = sc.nextFloat();
			ar = pi*radius*radius;
			System.out.print("Area is "+ar);
	}
}