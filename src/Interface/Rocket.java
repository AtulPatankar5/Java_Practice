package Interface;

interface Rocket1
{
	void fly();
}

interface Auto
{
	void moveonground();
}
class flight implements Rocket1,Auto
{
	public void fly() 
	{
		System.out.println("Rocket flies");
	}
	public void moveonground()
	{
		System.out.println("Auto flies");
	}
}

class Rocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		flight f= new flight();
		f.fly();
		f.moveonground();
		
	}

}
