package day7;

import java.util.*;

class Book{
	int id,quant;
	String name,author,publisher;
	public Book(int id, String name,String author, String publr, int quant) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publr;
		this.quant=quant;
	}
}

public class Collections_HashTable {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable();
		ht.put(100,"Amit");  
		//ht.put("day","Ravi");  
		ht.put(101,"Vijay");  
		ht.put(103,"Rahul"); 
		System.out.println(ht);
		
		
// .entrySet		
		System.out.println();
		for(Map.Entry m:ht.entrySet()) System.out.println(m.getKey()+" "+m.getValue());    //only type specified
		
// .remove		
		ht.remove(101);	
		System.out.println(ht);
// .getOrDefault
		System.out.println(ht.getOrDefault(102, "Not Found"));

// .putifabsent
		
		ht.put(104, "--");
		System.out.println(ht);
		
		ht.putIfAbsent(104, "Damn"); // doesnt replace the value
		System.out.println(ht);
		
		
		ht.put(104, "Abhay");// replace the value
		System.out.println(ht);
		
// .contains
		System.out.println(ht.contains("Abhay")); // only for values not key
		System.out.println(ht.containsKey(104));
// .hashcode		
		System.out.println(ht.hashCode());
		
// .clone
		Hashtable htc=new Hashtable();
		htc= (Hashtable) ht.clone();		
		System.out.println("Clone - "+ htc);
// .equals		
		System.out.println(ht.equals(htc));
		

// .putAll
		Hashtable<Integer,String> htpa=new Hashtable();
		htpa.put(11, "Satyy");
		ht.putAll(htpa);
		System.out.println(ht);
		
// .replace
		ht.replace(104, "Akshay");
		System.out.println(ht);
		System.out.println(ht.replace(103, "Rahul", "Ramesh"));
		System.out.println(ht.replace(103, "Rahul", "Harish"));
		
// .get
		System.out.println(ht.get(104));

// .empty
		System.out.println(ht.isEmpty());
		
// .clear
		ht.clear();
		System.out.println(ht);
		

		
// Book
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
	    Hashtable<Integer, Book> hb=new Hashtable();
	    hb.put(1, b1);
	    hb.put(2, b2);
	    hb.put(3, b3);
	    
	    for(Map.Entry<Integer,Book> m:hb.entrySet()) {   //require type
	    	Book b=m.getValue();
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quant);
	    }
	}

}
