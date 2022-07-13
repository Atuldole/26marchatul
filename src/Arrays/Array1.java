package Arrays;

public class Array1 {

	public static void main(String[] args) {
	
		// 1. Array declartion 
		char grade[]=new char[7];
		
		// 2. initialization of array
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		grade[6]='G';
		
		
		//3. usage
		
		System.out.println(grade[0]='A');
		System.out.println(grade[1]='B');
		System.out.println(grade[2]='C');
		System.out.println(grade[3]='D');
		System.out.println(grade[4]='E');
		System.out.println(grade[5]='F');	
		System.out.println(grade[6]='G');
		
	System.out.println("================================");
	
	for(int i=0;i<=6;i++) // static coding
	{
		System.out.println(grade[i]);
	}
	
	System.out.println("================================");
	for(int i=0;i<=grade.length-1;i++) //dynamic coding
	{
		
		System.out.println(grade[i]);
		
	}
	
	System.out.println("================================");
	 for(int i=grade.length-1;i>=0;i--)
	 {
		 System.out.println(grade[i]);
	 }
	
		System.out.println("Heloo GitHUB");
		
	}

}
