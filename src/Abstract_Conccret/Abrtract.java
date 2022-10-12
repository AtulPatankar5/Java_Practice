package Abstract_Conccret;



abstract class Sample2
{
	abstract void government();
	void test()
	{
		System.out.println("test");
	}
}

class Sample3 extends Sample2
{
	void government()
	
	{
		System.out.println("enter name ");
	}
}

class Abrtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample3 s= new Sample3();
		s.government();
		
	}

}
