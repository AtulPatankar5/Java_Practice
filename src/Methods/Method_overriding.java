package Methods;

class House1
{
	void house()
	{
		System.out.println("house made in 2000");
	}
	
}
class House2 extends House1
{
	void house()
	{
		System.out.println("house made in 2001");
	}
}


class Method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		House2 h= new House2();
		h.house();
	}

}
