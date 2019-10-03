class A implements Runnable{
	synchronized void table()throws Exception
	{
		for(int i =1;i<=10;i++)
			{
				System.out.print(i+"\t");
				
//					if(i==1)
//						Thread.currentThread().wait();
				
				//Thread.sleep(1000);
			}
	}
    public void run(){
		try{
					table();
			}
			catch(Exception e){
				System.out.println();
				e.printStackTrace();
			}

		
    }
}


class B implements Runnable{
    
	
		synchronized void table()throws Exception
		{
			for(int i =11;i<=20;i++)
				{
					System.out.print(i+"\t");
					
//						if(i==20)
//							Thread.currentThread().notify();
					
					//Thread.sleep(1000);
				}
		}
	
		public void run() {

			try{
					table();
			}
			catch(Exception e){
				System.out.println();
				e.printStackTrace();
			}

		}
}

class Thread1{
    public static void main(String[] args)throws Exception{
        Thread t1 = (new Thread(new A()));
        Thread t2 = (new Thread(new B()));
        t1.start();
        t2.start();
        System.out.print("\tbye\t");
    }
}