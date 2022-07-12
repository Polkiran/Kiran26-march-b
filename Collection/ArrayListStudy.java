package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		ArrayList<Comparable> a = new ArrayList<Comparable>();
		
		  a.add("Kiran");
		  a.add('A');
		  a.add(true);
		  a.add(12.23);
		  a.add("Pol");
		  a.add(null);
		  a.add(1221);
		  a.add(null);
		  a.add("Velocity");
		  
		  System.out.println(a);
		  System.out.println(a.size());
		  System.out.println(a.contains(1221));
		  System.out.println(a.get(5));
		  System.out.println(a.get(3));
		  System.out.println(a.indexOf(1221));
		  System.out.println(a.indexOf("Velocity"));
		  System.out.println(a.remove(5));
		  
		  System.out.println("=============");
		  for (int i=0;i<=a.size()-1;i++)
		  {
			  System.out.println(a.get(i));
		  }
		
		  System.out.println("=============");
		  
		 Iterator<Comparable> it = a.iterator();
		 
		 while(it.hasNext())
		 {
		    System.out.println(it.next());
		 }
		
		System.out.println("================");
		
		for(Object v:a)
		{
			System.out.println(v);
		}
		
		System.out.println("===================");
		
		ArrayList<Character> as = new ArrayList<>();
		
		as.add('A');
		as.add('B');
		as.add('C');
		as.add('D');
		as.add('E');
		as.add('F');
		
		System.out.println(as);
		
		for(Character a1:as)
		{
			System.out.println(a1);
		}
		
		
		
		
		
		
		
	}

}
