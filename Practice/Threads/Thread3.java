class Table extends Thread{
	int n;
	int i;
	public Table(int num){
		super();
		n=num;
	}
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			System.out.println(this.getName()+":"+i*n);
		}
	}
}
public class Thread3{
	public static void main(String[] args)
	{
		System.out.println(Thread.MAX_PRIORITY+" "+Thread.NORM_PRIORITY+" "+Thread.MIN_PRIORITY);
		Table t1 = new Table(5);
		Table t2 = new Table(10);
		Table t3 = new Table(20);
		t1.setPriority(Thread.NORM_PRIORITY+1);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY-1);
		t1.start();
		t2.start();
		t3.start();
	}
}