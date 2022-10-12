package Type_casting;

class General{
	void travel() {
		System.out.println(" can travel");
	}
}
class Sleeper extends General{
	void seat() {
		System.out.println("can have seat ");
	}
}
class AC extends Sleeper{
	void cool() {
		System.out.println("Can have cool air");
	}
}
class Train
{
	void Generalcoach(General g ) // upcasting
	{
		g.travel();
//		g.seat();
//		g.cool();	
	}
	void Sleepercoach( Sleeper s)
		{
			s.travel();
			s.seat();
//			s.cool();
		}
		void ACcoach(AC a) 
		{
			a.travel();
			a.seat();
			a.cool();
			
		}
}



class Ticket_upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Train p=new Train();
		p.Generalcoach(new General());// ticket of general in general coach
		p.Generalcoach(new Sleeper());// ticket of sleeper  in general coach
		p.Generalcoach(new AC());// ticket of AC in general coach
		
		//p.Sleepercoach(new General());// ticket of general in sleeper coach
		p.Sleepercoach(new Sleeper());// ticket of Sleeper in sleeper coach
		p.Sleepercoach(new AC());// ticket of AC in sleeper coach

		//p.ACcoach(new General());// ticket of general in AC coach
		//p.ACcoach(new Sleeper());// ticket of sleeper in AC coach
		p.ACcoach(new AC());// ticket of AC in AC coach
	}
}
