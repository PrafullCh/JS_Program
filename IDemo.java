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
   System.out.println("Value of i & j :"+i+"&"+j);
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
   System.out.println("Value of k :"+k);
  }

}


class Sub2Class extends SupClass
{

 char k;


  Sub2Class(int x,int y,char z)
  {
   super(x,y);
   k=z;
  }
  void show()
  {
   super.show();  
   System.out.println("Value of k :"+k);
  }

}


class IDemo
{
  public static void main(String[] args) 
	{
		SupClass s=new SupClass(10,20);
		s.show();

		s=new Sub1Class(10,20,30);
		s.show();

                s=new Sub2Class(10,20,'g');
		s.show();

               
             
	}
}