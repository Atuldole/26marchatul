package LogicalProgram;

public class FactorialOfNum {

	public static void main(String[] args) {
	
		int num=6;
		int num1=1;
		
		for(int i=num;i>=1;i--)
		{
			num1=num1*i; //6*1=6;6*5=30;4*30=120;3*120=360;2*360=720;
		} 
 		System.out.println("Factorial of number is" +num1);

	}

}
