package Type_casting;

class Demo11 extends Object
{
	int a= 12;
	void Democlass()
	{
		System.out.println("demo class");
	}
	
}
class Demo12 extends Object
{
	double b=1.2;
	void test() {
		System.out.println("test method");
	}
}
class Demo13 extends Object
{
	void run()
	{
		System.out.println("run method");
	}
}
class Sample20
{
	void start(Object r1)
	{
		System.out.println("Start method");
	}
	void start2(Demo12 d1)
	{
		d1.test();
	}
}

class upcasting4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample20 s= new Sample20();
		s.start(new Object());
		s.start(new Demo12());
		s.start(new Demo13());
		
		s.start2(new Demo11());
		s.start2(new Demo12());
	}

}
