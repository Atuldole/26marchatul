package String;

public class String1 {

	public static void main(String[] args) {
     
		String name="Velocity";  //without using ne kywrd
		String city=("Pune");  // using new kywrd
		
		// length () method use
		
		System.out.println(name.length());

		System.out.println(city.length());
		
		int output = name.length(); //storing  output  in refence variable

		System.out.println("length of string is "+output); //we can reuse refrence variable,
		

		System.out.println("===========================================");
		 // to uppercasemethod use
		
		String a="velocity";

		System.out.println(a);
     	System.out.println(a.toUpperCase());
     	String b=a.toUpperCase();
     	System.out.println(b);
        System.out.println(b.toLowerCase());
        String c=b.toLowerCase();
     	System.out.println(c);

		System.out.println("===============================");
		
		//. equals method
		
		String a1="Velocity";
		String a2="Velocity";
		String a3=new String("Velocity");
		String a4=new String("Velocity");
		String a5=new String("velocity");
		//== will compare memory location that will not compare string content
		

		System.out.println(a1==a2);
    	System.out.println(a1==a3);
    	System.out.println(a3==a4);

		System.out.println("=========================");
		//equal will compare contentvof Strings

		System.out.println(a1.equals(a2));
    	System.out.println(a1.equals(a3));
     	System.out.println(a1.equals(a4));
    	System.out.println(a4.equals(a5));
    	System.out.println(a1.equals(a5));	
    	System.out.println(a1.equalsIgnoreCase(a5));
    	

		System.out.println("=========================");
		
		//contains method use
		String b1="Velolcity";
		

		System.out.println(b1.contains("lo"));
		boolean result =b1.contains("lo");
		System.out.println("Result is "+result);
		System.out.println(b1.contains("city"));
		System.out.println(b1.contains("V"));
		
		
		
		
		
		
		
    	

		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
	}

}
