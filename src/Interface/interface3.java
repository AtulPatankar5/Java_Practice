package Interface;

interface Demo12
{
	void call();
}
interface Demo22 extends Demo12
{
	void text();
}
abstract class Demo32 implements Demo22
{
	public void call()
	{
		System.out.println("calling method");
	}
}
class Demo42 extends Demo32
{
	public void text()
	{
		System.out.println("text method ");
	}
}

class interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo42 d= new Demo42();
		d.call();
		d.text();
				
	}

}
