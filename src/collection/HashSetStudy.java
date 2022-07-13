package collection;


import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
      
		 HashSet hs= new HashSet();
		 hs.add("pune");
		 hs.add("pune");
		 hs.add(null);
		 hs.add(null);
		 hs.add(123);
		 hs.add(12.23);
		 hs.add(true);
		 hs.add('A');
		 
		 System.out.println(hs);
		 System.out.println(hs.size());
		 System.out.println(hs.contains('A'));
		 
		 System.out.println("==========for each====================================");
		  
		 for(Object p:hs)
		 {
			 System.out.println(p);
		 }
		 System.out.println("==========for itrator====================================");
		 
		 Iterator it =hs.iterator();
		 
		 while(it.hasNext())
		 {
			System.out.println(it.next()); 
		 }
		 System.out.println("==========for loop====================================");
		 
		//  for(int i=0;i<=hs.size()-1;i++)
		 
	
		  
		 
		  
		
		
			  
			
		  }
		 
		 
	}
