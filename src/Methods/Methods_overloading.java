package Methods;

class overload
{
	void main1()
	{
		System.out.println("main1");
	}
	void main1(int a)
	{System.out.println("main2");
		
	}
	void main1(int a, double b)
	{
		int value=a;
		double graph=b;
		System.out.println("main3");
		System.out.println(value);
		System.out.println(graph);
	}
}


 class Methods_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overload o= new overload();
		o.main1(3,43.3);
		
	}

}
