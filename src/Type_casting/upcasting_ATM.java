package Type_casting;

class Debitcard1{
	void swipe()	{
		System.out.println("swipe the card");
	}
}
class ICICIATM extends Debitcard1{
	void customercare() {
		System.out.println("call the customer");
	}
}
class ATM1{
	void transaction1(Debitcard1 db, ICICIATM ic) {
		db.swipe();
		ic.customercare();
		
	}
}

class upcasting_ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ATM1 a= new ATM1();
		a.transaction1(new Debitcard1(), new ICICIATM());
	}

}
