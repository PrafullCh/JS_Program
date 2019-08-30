import java.util.Scanner;
class  Sample
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int $num = 123456789;
		int hex = 0x123354;
		int oct = 01212;
		System.out.println("Hexadecimal to decimal number "+hex);
		System.out.println("Hexadecimal to decimal number "+oct);
		System.out.println($num);
		System.out.println("Enter Hex number");
		int $num3 = sc.nextInt(2);
		System.out.println("Hexadecimal to decimal number "+$num3);
	}
}
