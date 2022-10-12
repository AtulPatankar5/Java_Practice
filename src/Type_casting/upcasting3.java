package Type_casting;

class Notebook
{
	void paper()
	{
		System.out.println("used to write");
	}
	void futta()
	{
		System.out.println("Cover of book");
	}
}
class Pen  extends Notebook
{
	void cello()
	{
		System.out.println("blue pen");
	}
}
class Student123 extends Pen
{
	void writenotes(Notebook n1) // upcasting 
	{
		n1.paper();
		n1.futta();
		//p1.cello();
	}
	void writenotes2( Pen p1)
	{
		p1.cello();
		p1.futta();
		p1.paper();
	}
}

 class upcasting3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student123 s=new Student123	();
		s.writenotes(new Notebook());
		s.writenotes(new Pen());//upcasting
		
		//s.writenotes2(new Notebook());	
		s.writenotes(new Pen());
	}

}
