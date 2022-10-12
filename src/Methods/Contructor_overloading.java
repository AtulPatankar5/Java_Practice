package Methods;

class Demo2
{
	Demo2()
	{
		
		System.out.println("1st ");
	}
	Demo2(int a )
	{
		this();
		System.out.println("2nd");
	}
	Demo2(int a, double b)
	{
		this(76);
		System.out.println("3rd");
	}
}

class Contructor_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo2 d1= new Demo2(98,94.24);
		
	}

}
