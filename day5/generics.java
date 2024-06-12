package day5;

import java.util.*;

public class generics {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Satwik");
		list.add("Shree");
		//list.add(32);
		String s=list.get(1);
		System.out.println("s - "+ s);
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		Map<Integer,String> hs=new HashMap<Integer,String>();
		
	}

}
