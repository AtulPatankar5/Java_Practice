package Methods;

class Demo1
{
	Demo1(int a)
	{
		System.out.println("first contructor="+a);
	}
	Demo1()
	{
		System.out.println("2nd contructor=");
	}

	Demo1(int a, double b)
	{
		System.out.println("first contructor="+a);
	}
	Demo1 ( double b, int a)
	{
		System.out.println("4th ciontreuctoe "+a);
	}

}
 class multiple_contructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 d1= new Demo1(4);
		Demo1 d2= new Demo1();
		Demo1 d3= new Demo1(4, 45.34);
		Demo1 d4= new Demo1(283.34,234);
		
	}

}
