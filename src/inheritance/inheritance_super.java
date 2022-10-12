package inheritance;

class Demo1
{
	Demo1(int a, double b)
	{
		System.out.println("classs 1 is started");
	}
}
class Demo2 extends Demo1
{
	Demo2()
	{
		super(45,23.42);
		System.out.println("class 2 is begins");
	}
}

class inheritance_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo2 d= new Demo2();
	}

}
