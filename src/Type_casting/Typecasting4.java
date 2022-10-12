package Type_casting;

class debitcard
{
	void swipe()
	{
		System.out.println("swipe the card");
	}
	void enterpin()
	{
		System.out.println("enter pin");
	}
	
}
class ATM
{
	
	void transaction(debitcard db)
	{
		db.swipe();
		db.enterpin();
	}
}

class Typecasting4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ATM a= new ATM();
		a.transaction(new debitcard());
		
	}

}
