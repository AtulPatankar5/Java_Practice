package Practice_1;

import java.util.Scanner;

class no_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("eneter num");
		int num=sc.nextInt();
		
		int count=0;
		while(num!=0)
		{
			num=num/10;	
			count++;
			
		}
		System.out.println("Count="+count);
		
	}

}
