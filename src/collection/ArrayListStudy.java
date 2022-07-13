package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudy {

	

	public static void main(String[] args) {
     ArrayList a= new ArrayList<>();
     
     a.add("velocity");
     a.add('A');
     a.add(123);
     a.add(true);
     a.add(123.123);
     a.add("velocity");
     a.add(null);
     a.add(123);
     a.add(null);
     
     System.out.println(a);
     System.out.println(a.size());
     System.out.println(a.isEmpty());
     
     System.out.println(a.contains(123));
     System.out.println(a.get(1));
     System.out.println(a.indexOf(123));
     System.out.println(a.indexOf("velocity"));
     System.out.println(a.lastIndexOf("velocity"));
     System.out.println(a.remove(1));
     System.out.println(a);
     
     System.out.println("=====================================");
     
     for(int i=0;i<=a.size()-1;i++)
     {
    	 System.out.println(a.get(i));
    	 
     }
     System.out.println("==============================");
     
     Iterator it = a.iterator();
     while(it.hasNext())//
     {
    	 System.out.println(it.next());
     }
     System.out.println("=================================");
     
     ArrayList<Character>as=new ArrayList<>();
     as.add('A');
     as.add('B');
     as.add('C');
     as.add('D');
     as.add('E');
     as.add('F');
     
     System.out.println(as);
     for(Character d:as)
     {
    	 System.out.println(d);
     }
     System.out.println("===================================");
     ArrayList<Integer>ai=new ArrayList<>();
     ai.add(12);
     ai.add(10);
     ai.add(9);
     ai.add(15);
     System.out.println(ai);
     
     for(Integer s:ai)
     {
    	 System.out.println(s);
     }
     
		
		
	}

}
