package encapsulation;

class Adharnumber
{
	private String name;
	private int adnum;
	private int age;
	public Adharnumber(String name, int adnum, int age)
	{
		this.name= name ;
		this.adnum=adnum;
		this.age=age;
	}
	public void setname(String setnm )
	{
		name=setnm;
	}
	public void setadnum(int setadn)
	{
		adnum=setadn;
	}
	public void setage(int setag)
	{
		age=setag;
	}
	public String getname()
	{
		System.out.println("otp is generated ");
		System.out.println("name is updated ");
		return name;
		
	}
	public int getnum()
	{
		System.out.println("otp is generated ");
		System.out.println("number is updated ");
		return adnum;
	}
	public int getage()
	{
		System.out.println("otp is generated ");
		System.out.println("age is updated ");
		return age;
	}
}

class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adharnumber a= new Adharnumber("Atul",7813762,16);
		String username=a.getname()	;
		System.out.println("name"+ username);
		int usernumber=a.getnum();
		System.out.println("adharnumber="+usernumber);
		int userage=a.getage();
		System.out.println("useage="+userage);
	
		System.out.println();
		a.setadnum(123435);
		a.setname("patankar");
		a.setage(76);

		int user2age=a.getage();
		System.out.println("user2age="+user2age);
		int user2num=a.getnum()	;
		System.out.println("user2num="+user2num);
		String user2name=a.getname();
		System.out.println("user2name="+user2name);
	}

}

