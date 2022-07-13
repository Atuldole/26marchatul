package LogicalProgram;

import java.util.Scanner;

public class EvenOddNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Given number is odd number");
		}
	}

}
