class SupClass
{
  int i;
  int j;
  SupClass(int x,int y)
  {
   i=x;
   j=y;
  }

  void show()
  {
   System.out.print("Value of i & j :"+i+"&"+j);
  }
  	
}

class Sub1Class extends SupClass
{

  int k;


  Sub1Class(int x,int y,int z)
  {
   super(x,y);
   k=z;
  }
  void show()
  {
   super.show();  
   System.out.print("Value of k :"+k);
  }

}


class IDemo
{
  public static void main(String[] args) 
	{
		Sub1Class s1=new Sub1Class(10,20,30);
		s1.show();
	}
}