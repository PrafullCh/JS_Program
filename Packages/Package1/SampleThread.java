class SampleThread extends Thread{
	int num;

	SampleThread(int num)
	{
		this.num = num;
	}

	void table()
	{
		for(int i=1;i<10;i++)
		{
			try{
			System.out.println(i*num);
		        Thread.sleep(1000);
			}catch(Exception e)
			{

			}
		}
	}

	public void run(){
		this.table();
	}

	public static void main(String[] args) {
		SampleThread s = new SampleThread(5);
		SampleThread s1 = new SampleThread(10);
		s.start();
		s1.start();
		System.out.println("End of main method");
	}
}