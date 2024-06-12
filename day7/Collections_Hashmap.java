package day7;

import java.util.*;

public class Collections_Hashmap {

	public static void main(String[] args) {
		HashMap <Integer,String> hm= new HashMap<Integer, String>();
		hm.put(1,"Ajay");
		hm.put(2,"Warul");
		hm.put(3, "Govind");
		System.out.println(hm);
		
		for(Map.Entry m: hm.entrySet()) System.out.println(m.getKey()+" "+m.getValue());
		
// .isEmpty		
		System.out.println("isEmpty - "+ hm.isEmpty());
// .clone
		HashMap <Integer,String> hmc= new HashMap<Integer, String>();
		hmc= (HashMap) hm.clone();
		System.out.println(hmc);

// .putIfAbsent
		hm.putIfAbsent(3, "Abhay");
		System.out.println(hm);
		
// .remove
		hm.remove(1);
		System.out.println(hm);
		hm.remove(2, "Warul");
		System.out.println(hm);

// .replace
		hm.replace(3, "Daya");
		System.out.println(hm);

// .contains
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsValue("Abhay"));

// .equals
		System.out.println(hm.equals(hmc));

// .get
		System.out.println(hm.get(1));
		System.out.println(hm.getOrDefault(2, "Not Found"));



		
	}

}
