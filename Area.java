class Area {
	
	final float pi= 3.14f;
	float area;
	Area(float radius)
	{  
		area = pi*radius*radius;
		System.out.println("\nArea of Circle is "+area);
	}
	Area(float base,float height)
	{
		area = 0.5f*base*height;
		System.out.println("\nArea of Triangle is "+area);	
	}
}
class Area2{
	public static void main(String args[])
	{
		
		Area a =(args.length>1)?new Area(Float.parseFloat(args[0]),Float.parseFloat(args[1])):new Area(Float.parseFloat(args[0]));
	}
}