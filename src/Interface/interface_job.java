package Interface;
interface Job
{
	int student=10;
	void skill();
	void communication();
	
}

abstract class Round1 implements Job 
{
	public void skill() {
		System.out.println("skills requried");
	}
}
 class Round2 extends Round1
{
	public void communication()
	{
		System.out.println("communcation is required");
	}
}

class interface_job {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Round2 r= new Round2();
		r.skill();
		r.communication();
		System.out.println("serial no.="+r.student);
		
	}

}
