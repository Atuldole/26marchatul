package Arrays;

public class StringArray {

	public static void main(String[] args) {
		
		String name[]= new String[3];
		
		name[0]="Ram";
		name[1]="Laxman";
		name[2]="Seeta";
		
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("=================================");
		
		int rollno[]= {6,2,4,1,3,5}; // 1+2 declartion + initialization
		
		// 3. usage
		
				
		for(int i=0;i<=rollno.length-1;i++)
		{
			System.out.println(rollno[i]);
		}
		System.out.println("=================================");
		
//		How to short given array
//		we need to use sort method
		
	//	Arrays.short(rollno);
		for(int i=rollno.length-1;i>=0;i--)
		{
			System.out.println(rollno[i]);
		}
		
	}

}
