package Access_specifier;

class Program12
{
	public static void main(String[] args) {
		Program1 p= new Program1();
		System.out.println(p.a);
		p.test();
		
		System.out.println(p.b);
		p.test1();
		
		System.out.println(p.c);
		p.run();
		
		//System.out.println(p.res);
		//p.disp();
	}
}
  public class Program1 {

	 public int a=12;
		public void test()
		{
			System.out.println("executing test method");
		}
		protected double b= 12.34;
		protected void test1()
		{
			System.out.println("executing test methods");
		}
		float c=123.3f;
		void run()
		{
			System.out.println("exutctin default method ");
		}
		private Boolean res= false ;
		private void disp() {
		}
		{
			System.out.println("private method ");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
		
	}


