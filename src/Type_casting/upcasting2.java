package Type_casting;

class Sample1
{
	int a=12;
}
class Sample2 extends Sample1
{
	int b=3;
	
}
class Sample3 extends Sample2
{
	int c=24;
}

class upcasting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample3 s= new Sample3();
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println(s.c);
		
		Sample2 s1= s;
		System.out.println(s1.a);
		System.out.println(s1.b);
//		System.out.println(s1.c);
		
		Sample1 s2=s1;
		System.out.println(s2.a);
//		System.out.println(s2.b);
//		System.out.println(s2.c);
		
	}

}
