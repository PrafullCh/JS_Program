class Area{
	double res;
	Area()
	{
		System.out.println("Default Constructor");
	}
	Area(float radius)
	{
		res = 3.14f*radius*radius;
		System.out.println("Area of cirlce is " + res );
	}
	Area(float length,float width)
	{
		res = length*width;
		System.out.println("Area of rectangle is " + res );
	}
	Area(int  base,int height)
	{
		res = 0.5f*base*height;
		System.out.println("Area of triangle is " + res );
	}
}
class AreaDemo{
	public static void main(String[] args) {
			Area o = new Area();
			Area o1 = new Area(54.3f);
			Area o2 = new Area(21.5f,24.5f);
			Area o3 = new Area(45,65);
	}
}