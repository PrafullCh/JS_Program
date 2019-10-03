class NamedControlStatement{
	public static void main(String args[])
	{
		l1:for(int i=1;i<10;i++)
		{
			for(int j = 1 ; j<10 ; j++)
			{
				if(j==5)
//					break l1;
					continue l1;
				System.out.print(j+"\t");
				
			}
			System.out.println();
		}
	}
}