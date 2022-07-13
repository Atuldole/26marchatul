package LogicalProgram;

public class ReverseMiddleString {

	public static void main(String[] args) {
		// reverse even position Strings
		
		String s="I love you ATUL";
		String ar[]=s.split(" "); //{"I", "love", "you", "ATUL"}
                                  // 0 1 2 3
		for(int i=0;i<=ar.length-1;i++)
		{
			if(i%3!=0) //odd index
			{
			
				 String s1 = ar[i];
				ar[i]=revStr(s1);
			}
		}
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]+" ");
		}
	}

	private static String revStr(String input) {
		String rev="";
		for(int i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
		}
		
		
		return rev;
	}

} 