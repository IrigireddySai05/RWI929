package day6;

import java.util.*;

public class Collection_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(24);
		al.add(2345);
		al.add(65);
		System.out.println(al);
		System.out.println("Iterator");
		Iterator it=al.iterator();
		while(it.hasNext()) System.out.println(it.next());
		System.out.println("For");
		for(Integer is:al) System.out.println(is);
		
		
		
//Non generic
		ArrayList nongen=new ArrayList();	
		nongen.add(3);
		nongen.add("SFFF");
		nongen.add(false);
		nongen.add(23.4);
		nongen.add('r');
		System.out.println(nongen);
		
		
//get and set
		System.out.println("get - " + al.get(1));
		al.set(0, 5678);
		System.out.println("Set -");
		System.out.println(al);
		
//Sort
		ArrayList<String> als=new ArrayList();
		als.add("Shruti");
		als.add("Akkuuu");
		als.add("Harshu");
		als.add("Mannuu");
		als.add("Veduuu");
		als.add("Tinaaa	");
		System.out.println("before sort - "+ als);
		Collections.sort(als);
		System.out.println("after sort - " + als);

		


	}

}
