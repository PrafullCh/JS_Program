class Thread2 extends Thread{
	int num;
	int i;
	Thread2(int n){
		super(String.valueOf(n));
		num=n;
	}
	public void run(){
			for(i=1;i<=10;i++)
			{
				System.out.println(Thread.currentThread().getName()+" : "+i*num+"\t");
				if(i==10)
				{
					synchronized(this){
						try{
							notify();	
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}

					}
				}
			}
		
	}
	public static void main(String[] args)throws Exception{
		Thread t1 = new Thread2(5);
		Thread t2 = new Thread2(19);
		t1.start();
		t2.start();
		synchronized(t1){
			t1.wait();
		}
	}
}