package Abstract_Conccret;

abstract class Hotstar
{
	abstract void rudra();
	void specialoop()
	{
		System.out.println("prime number");
	}
}
class subscriber extends Hotstar
{
	void rudra()
	{
		System.out.println("Watch the video ");
	}
}

class contrete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		subscriber s= new subscriber();
		s.rudra();
	}

}
