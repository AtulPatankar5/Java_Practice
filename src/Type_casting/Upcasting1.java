package Type_casting;

class Landline
{
	void call()
	{
		System.out.println("makes call");
	}
}
class Mobile extends Landline
{
	void music()
	{
		System.out.println("plays music");
	}
	void games()
	{
		System.out.println("plays games");
	}
}


class Upcasting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Landline l1= new Mobile();
		Mobile l2= (Mobile) new Landline()	;
		l1.call();
		//l1.music();
		//l1.games();
		l2.call();
		l2.music();
		l2.games();
	}

}
