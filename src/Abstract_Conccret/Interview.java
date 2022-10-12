package Abstract_Conccret;

abstract class Interviewpro
{
	abstract void Aptitude();
	abstract void Technical	();
	abstract void HR();
}
abstract class Round1 extends Interviewpro
{
	void Aptitude()
	{
		System.out.println("clear interview");
	}
	
	
}
abstract class Round2 extends Round1
{
	void Technical()
	{
		System.out.println("clear technical ");
	}
}
class Round3 extends Round2
{
	void HR()
	{
		System.out.println("clear HR");
	}
}
class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Round3 r= new Round3();
		r.HR();
		r.Technical();
		r.Aptitude();
	}

}
