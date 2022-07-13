package collection;

import java.util.EventObject;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		
		LinkedList ll= new LinkedList();
		
		ll.add("velocity");
		ll.add(123);
		ll.add('A');
		ll.add("velocity");
		ll.add(null);
		ll.add(null);
		ll.add(12.12);
		ll.add(true);
		
		
		
		System.out.println(ll);
		
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.peek()); // Retrieve do not remove
		System.out.println(ll);
		System.out.println(ll.poll()); //Retrieve  & remove
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll.pop());
		System.out.println(ll);
		
		System.out.println("=====1 for loop========================================1");
		
		//for loop
		
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("=======2 for each========================================2");
		
		//for each
		
		
		for(Object o:ll)
		{
			System.out.println(o);
		}
		
	
		
		System.out.println("=========3 for iterator==========================================3");
		
		// itlator
		
      Iterator i = ll.iterator();
      while(i.hasNext())
      {
    	  System.out.println(i.next());
      }
      
      
      
      System.out.println("==========4 for list iterator=============================================4");
      
       ListIterator l = ll.listIterator();
       while(l.hasNext())
       {
    	   System.out.println(l.next());
       }
    	   
       
      
		
	}

}
