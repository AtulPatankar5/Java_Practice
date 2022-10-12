package Interface;

interface Demo1
{
	int a=12;
	void test();
}
class Demo2 implements Demo1
{
	
	public void test()
	{
		System.out.println("enter test ");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo2 d= new Demo2();
		d.test();
		System.out.println(Demo1.a);
	}

}
