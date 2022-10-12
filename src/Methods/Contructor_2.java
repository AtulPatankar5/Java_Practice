package Methods;


class Javacertificate
{
	String name;
	int attendance;
	int marks;
	Javacertificate(String name,int attendance, int marks ) {
		this.name=name;
		this.attendance=attendance;
		this.marks=marks;
	}
}
 class Contructor_2 {

	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	Javacertificate jv=new Javacertificate("Atul", 76, 98);
	System.out.println("name="+jv.name);
	System.out.println("attendance="+jv.attendance);
	System.out.println("marks="+jv.marks);

	Javacertificate j2= new Javacertificate("omkar",8, 0);
			System.out.println("name="+j2.name);
			System.out.println("attendance="+j2.attendance);
			System.out.println("marks="+j2.marks);
			
	}

}
