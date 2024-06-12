package day7;

import java.util.*;

class Book1{
	int id,quant;
	String name,author, publisher;
	public Book1(int id,String name, String author,String publisher,int quant) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quant=quant;
	}
}

public class Collections_HashSet {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(234);
		hs.add(234);
		hs.add(4567);
		hs.add(3456);
		System.out.println(hs);
		System.out.println();
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext()) System.out.println(it.next());
		
		System.out.println();
		hs.remove(4567);
		System.out.println(hs);
		HashSet<String> hss=new HashSet<String>();
		hss.add("Four");
		hss.add("Ten");
		hss.add("Five");
		//		hss.addAll(hs);
		//		System.out.println(hss);
		//		hss.addAll(hs);
		//		System.out.println(hss);
		//		hss.add(hss);
		System.out.println(hss);
//		hss.addAll(hss);
//		System.out.println(hss);
		hs.clear();
		System.out.println(hs);
		System.out.println(hss);
		
		hss.removeAll(hs);
		System.out.println(hss);
		
		System.out.println(hss.contains(hs));
		System.out.println(hss.containsAll(hs));
		System.out.println(hs.isEmpty());
		
		//		HashSet<Integer> hs = new HashSet();
		//		hs.add(234);
		//		hs.add(234);
		//		hs.add(4567);
		//		hs.add(3456);
		HashSet<Integer> hc= new HashSet<Integer>();
		hc=(HashSet<Integer>)hs.clone();
		System.out.println(hc);
		
// Another Collection
		ArrayList<Integer> lst=new ArrayList<Integer>();
		lst.add(345);
		lst.add(87);
		lst.add(923);
		HashSet s=new HashSet(lst);
		s.add(3434);
		s.add("Yo me");
		System.out.println(s);
		
		
//Book
		HashSet<Book1> hb=new HashSet<Book1>();
		
		Book1 b1= new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book1 b2= new Book1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Book1 b3= new Book1(103,"Operating System","Galvin","Wiley",6);
		
		
		hb.add(b3);
		hb.add(b2);
		hb.add(b1);
		Iterator<Book1> it1=hb.iterator();
		while(it1.hasNext()) {
			Book1 b=it1.next();
			System.out.println(b.id+" "+ b.name+" "+b.author+" "+b.publisher+' '+b.quant);
		}
		System.out.println();
		for(Book1 b:hb) System.out.println(b.id+" "+ b.name+" "+b.author+" "+b.publisher+' '+b.quant);

	}

}
