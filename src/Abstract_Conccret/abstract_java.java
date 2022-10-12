package Abstract_Conccret;

abstract class javaknowledge
{
	abstract void attendclass();
	abstract void practice();	
}
abstract class Student1 extends javaknowledge
{
	void attendclass()
	{
		System.out.println("attends 75%");
	}
}
class Student2 extends Student1
{
	void practice()
	{
		System.out.println("Practice regularly");
	}
}

class abstract_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 s= new Student2();
		s.practice();
		s.attendclass();
		
	}
	
	

}
