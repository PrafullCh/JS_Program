class Program3{
	void run(){};
	public static void main(String[] args) {
		Program3 obj = new Program3(){
			void run()
			{
				System.out.println("Anynomous");
			}
		};
		Program3 obj1 = new Progr	am3(){
			void run()
			{
				System.out.println("Anynomous 2 running");
			}
		} ;
		obj.run();
		obj1.run();
	}
}