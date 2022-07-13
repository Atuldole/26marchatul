package collection;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
	
		Vector v =new Vector();
		
		v.add("bhopal");
		v.add('A');
		v.add("pune");
		v.add(null);
		v.add(null);
		v.add(12);
		v.add(1.2);
		v.add(879848);
		
		System.out.println(v.elementAt(0));
		System.out.println(v.get(1));
		System.out.println(v);
		System.out.println(v.remove(1.2));
		System.out.println(v);
		
		
		System.out.println("====================================");
		
		ListIterator lit = v.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println("====================================");
		
		
		Enumeration ve = v.elements();
		while(ve.hasMoreElements())
		{
			System.out.println(ve.nextElement());
		}
		System.out.println("====================================");
		
	}

}
