package Type_casting;

class laptop
{
	void browser(String link )
	{
		System.out.println("join the class");
	}
}
class Student
{
	void test(int a)
	{
		System.out.println("student pass");
	}
	void attendance( laptop l1)
	{
		l1.browser("www.hnejc.com");
	}
}


class Upcasting_laptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		s.attendance(new laptop());
	}

}
