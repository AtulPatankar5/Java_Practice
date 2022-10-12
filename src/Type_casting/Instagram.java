package Type_casting;

class Version2
{
	void reel()
	{
		System.out.println("Play reel");
	}
	void uploadpicswithtag()
	{
		System.out.println("upload pic along with Tag");
	}
}
class Version1 extends Version2
{
	void uploadpic()
	{
		System.out.println("Upload pic only");
	}
}

class Instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Version1 v1=  new Version1();
		v1.reel();
		v1.uploadpicswithtag();
		v1.uploadpic();
		
		Version2 v= v1;
		v.reel();
		v.uploadpicswithtag();
		//v.uploadpic();
		
	}
	

}
