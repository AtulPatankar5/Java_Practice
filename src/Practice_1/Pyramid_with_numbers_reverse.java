package Practice_1;

import java.util.Scanner;

public class Pyramid_with_numbers_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.println("enter row");
		int row= sc.nextInt();
		System.out.println("eneter column");
		int col= sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
				{	
				if((i+j)<=(row+1))
				{
					System.out.print(j+" ");
				}
				
				}
			System.out.println();
	}
	}
}
