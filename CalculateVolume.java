class  CalculateVolume
{
	float h,b,l;
	float calculate()
	{
		float area = h*b*l;
		return area;
	}
	public static void main(String[] args) 
	{
		CalculateVolume obj = new CalculateVolume();
		obj.h=Float.parseFloat(args[0]);
		obj.b=Float.parseFloat(args[1]);
		obj.l=Float.parseFloat(args[2]);
		System.out.println(obj.calculate());
	}
}
