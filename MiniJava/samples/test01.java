class Main
{
	public static void main(String[] args)
	{
		System.out.println(args);
	}
}

class Shape 
{
	int[] p;
	int z;
	public int getArea(int a, int b, int c)
	{
		return 243;
	}
}

class Rectangle extends Shape
{
	Shape q;
	public int getArea(int a, int b, int c)
	{
		int nWidth;
		int nHeight;
		int nArea;
		nArea = nWidth;
		nArea = nArea * nHeight;
		
		return nArea;
	}
}

class Circle extends Shape
{
	public int getArea(int a, int b, int c)
	{
		int nRadius;
		
		return nArea;
	}
}
