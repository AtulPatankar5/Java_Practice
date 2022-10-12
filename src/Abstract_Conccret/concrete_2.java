package Abstract_Conccret;

abstract class Trainer 
{
	abstract void assignment();
	
}
class student extends Trainer
{
	void assignment()
	{
		System.out.println("doo the assignment ");
	}
}
 class concrete_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s= new student();
		s.assignment();
	}

}
