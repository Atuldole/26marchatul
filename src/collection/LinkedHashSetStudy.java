package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
		
		LinkedHashSet ls = new LinkedHashSet();
		
		ls.add("pune");
		ls.add("pune");
		ls.add('A');
		ls.add(123);
		ls.add(12.234);
		ls.add(null);
		ls.add(null);
		ls.add(true);
		
		System.out.println(ls);
		System.out.println(ls.contains('A'));
		System.out.println(ls.size());
		
		System.out.println("=========for each====================");
		
		for(Object g:ls)
		{
			System.out.println(g);
		}
		System.out.println("=========for itrator====================");
		
		Iterator  it = ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=========for loop====================");
		
		
	
		

				
				
		

		
		
	}

}
