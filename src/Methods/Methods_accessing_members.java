package Methods;

class Methods2
{
	static int number=1;
	static void classroom()
	{
		System.out.println("noisy class");
	}
	int age=62;
	void table()
	{
		System.out.println("moving table ");
	}
}


class Methods_accessing_members {

	 static int num=1;
	static int a=9;
	String name="Patankar";
	String post(String a) 
	{
		System.out.println("postman");
		return "value";
	 }
	 static void test()
	 {
		 int b=1;
		 System.out.println("my name is atul");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("num="+num);
		test();
		System.out.println("a="+a);
		System.out.println(a);
		String language =new Methods_accessing_members().post("watchman");
		
		System.out.println("lanuage ="+language);
		System.out.println("sirname="+new Methods_accessing_members().name);
		
		System.out.println("number="+Methods2.number);
		Methods2.classroom();
		System.out.println("age"+new Methods2().age);
		new Methods2().table();
	}

}
