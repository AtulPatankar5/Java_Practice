package Practice_1;

import java.util.Scanner;

public class Floyds_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.println("enter row");
		int n= sc.nextInt();
		int temp=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				{
				System.out.print(temp++ +" " );
				}
			System.out.println();
				}
	}

}
