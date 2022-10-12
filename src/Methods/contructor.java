package Methods;

class Pen
{
	String brand;
	String colour;
	float cost;
	Pen()
	{
		System.out.println("pen created ");
		brand="cello";
		colour="blue";
		cost=5;
	}

}
class contructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pen p= new Pen();// non-parameterized constructor
		System.out.println("brand="+p.brand);
		System.out.println("colour="+p.colour);
		System.out.println("price="+p.cost);
	}

}
