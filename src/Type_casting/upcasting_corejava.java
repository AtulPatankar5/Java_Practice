package Type_casting;

class Corejava{
	void corejava() {
		System.out.println("know java");
	}
}
class Selenium extends Corejava{
	void Automation() {
		
			System.out.println("knows selenium");
		
	}
	void Manual()
	{
		System.out.println("knows Manual ");
	}
	
}
class Student1234
{
	void Rahul ( Corejava c)
	{
		
		//c.Automation();
		//c.Manual();
		c.corejava();
	}
}
class upcasting_corejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1234 s= new Student1234 ();
		s.Rahul(new Corejava());
		s.Rahul(new Selenium());// upcasting 
	}

}
