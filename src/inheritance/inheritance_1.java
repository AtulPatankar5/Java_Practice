package inheritance;

class college1
{
	void searchcollege()
	{
		System.out.println("collge name is XYZ");
	}
	void canteen()
	{
		System.out.println("food is faltu");
	}
	
}
class college2 extends college1
{
	void rules()
	{
		System.out.println("all follows SPPU");
	}
}
 class inheritance_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		college2 c=new college2();
		c.rules();
		c.canteen();
		c.searchcollege();
	}

}
