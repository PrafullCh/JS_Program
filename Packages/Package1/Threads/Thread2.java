class Thread2 implements Runnable{
	int num;

	Thread2(int num)
	{
		this.num = num;
	}

	void table()
	{
		for(int i=1;i<10;i++)
		{
			try{
            System.out.println(Thread.currentThread()+" "+(i*num));
            Thread.currentThread().join(1000);
		       
			}catch(Exception e)
			{

			}
		}
	}

	public void run(){
		this.table();
	}

	public static void main(String[] args) {
        Runnable s = new Thread1(5);
        Thread t1 = new Thread(s);
        t1.setName("thread 1");
        Runnable s1 = new Thread1(10);
        Thread t2 = new Thread(s1);
        t2.setName("thread 2");
        t1.start();
        try{
            t1.join(1000);
        }
        catch(Exception e){}
       
		t2.start();
		System.out.println("End of main method");
	}
}