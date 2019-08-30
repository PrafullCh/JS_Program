
abstract class Program1{
	abstract void run();
}
class Program2{
	public static void main(String[] args) {
		Program1 obj = new Program1(){
			void run()
			{
				System.out.println("Anynomous");
			}
		};
		Program1 obj1 = new Program1(){
			void run()
			{
				System.out.println("Anynomous 2 running");
			}
		} ;
		obj.run();
		obj1.run();
	}
}