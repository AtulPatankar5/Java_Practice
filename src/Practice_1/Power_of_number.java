package Practice_1;

import java.util.Scanner;

class Power_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("eneter num");
		int num1=sc.nextInt();
		System.out.println("eneter power");
		int num2= sc.nextInt();
		
		int num=1;
		for(int i=1; i<=num2;i++)
		{
			num=num*num1;
		}
		System.out.println("Answer="+num);
	}

}
