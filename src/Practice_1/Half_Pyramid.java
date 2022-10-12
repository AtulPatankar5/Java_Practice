package Practice_1;

import java.util.Scanner;

public class Half_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc= new Scanner (System.in);
		System.out.println("enter row");
		int row= sc.nextInt();
		System.out.println("eneter column");
		int col= sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
				{
				
					System.out.print("* ");
				}
			
			System.out.println();
	}
	}
}
