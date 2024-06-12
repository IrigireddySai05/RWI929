package day3_StringPractice_hw;

import java.util.ArrayList;

public class String_method {

	public static void main(String[] args) {
		String name="Shruti";
//.charAt
		char ch=name.charAt(3);
// .length
		System.out.println("char at 4rd index- "+ ch);
		System.out.println("length - "+ name.length());
		System.out.println("reverse - "+ name.charAt(name.length()-2));	
// .format
		String sf1=String.format("name is %s",name);
		String sf2=String.format("Float is %f", 12345.7654);
		String sf3=String.format("fixed float is %.12f",23.1234);
		String sf4=String.format("num is %d",12345);
		String sf5=String.format("char is %c",'d');
		System.out.println("format - " +sf1);
		System.out.println("format - " +sf2);
		System.out.println("format - " +sf3);
		System.out.println("format - " +sf4);
		System.out.println("format - " +sf5);
// .substring
		String a="Hi peeps, mast convo enjoyingg";
		System.out.println(a.substring(0,8));
		//System.out.println(a.substring(0,6));
// palindrone
		String str[] =  
			{  
			"madam",  
			"rock",  
			"eye",  
			"noon",  
			"kill"  
			};  
		System.out.println(str.length);
		
// .contains
		String con="Institute";
		//char did='a';               //cant use char with string
		String did="a";
		System.out.println("contains - " +con.contains(did));
		
		String sr = "Welcome to JavaTpoint!";  
		  
		// comparing a string to null  
	//		if(sr.contains(null))  //nullpointer Exception
	//		{  
	//			System.out.println("Inside the if block");  
	//		}  
	//		else  
	//		{  
	//			System.out.println("Inside the else block");  
	//		}  
		
// .join
		String date= String.join("/", "05","05,","2001");
		System.out.println(date);
		// r = String.join(null, "abc", "bcd", "apple");   null pointer Exception
		//System.out.println(r);

		
// .equals
		String s1="java learning";
		String s2="java learning";
		String s3="Java learning";
		System.out.println("equals - " + s1.equals(s2));
		System.out.println("equals - " + s1.equals(s3));
		int s4=44;
		String s5="44";
		System.out.println("equals - " + s5.equals(s4));
		
		
		String str1="satya";
		ArrayList<String> arl=new ArrayList<>();
		arl.add("Shyam");
		arl.add("Satya");
		arl.add("Manoj");
		for(String ss:arl)
			if(ss.equals(str1)) System.out.println("Satya hai");
			else System.out.println(" Satya nhi hai");

		String str6 = "a";  
		String str7 = "123";  
		String str8 = "45.89";  
		String str9 = "false";  
		Character c = new Character('a');  
		Integer i = new Integer(123);  
		Float f = new Float(45.89);  
		Boolean b = new Boolean(false); 
		System.out.println("Char equals - " + str6.equals(c));
		System.out.println("Int equals - " + str7.equals(i));
		System.out.println("FLoat equals - " + str8.equals(f));
		System.out.println("Bool equals - " + str9.equals(b));
		

// .equalsignorecase
		System.out.println("equals ignore case - " + s1.equalsIgnoreCase(s2));
		System.out.println("equals ignore case - " + s1.equalsIgnoreCase(s3));
		//System.out.println("equals - " + s5.equalsIgnoreCase(s4));           only string allowed not int
		

		
// .toString		
		System.out.println("Char equals - " + str6.equals(c.toString()));
		System.out.println("Int equals - " + str7.equals(i.toString()));
		System.out.println("FLoat equals - " + str8.equals(f.toString()));
		System.out.println("Bool equals - " + str9.equals(b.toString()));
		
// .isEmpty
		String tre="";
		String tr2="sdfghn";
		System.out.println("if empty - " + tre.isEmpty());
		System.out.println("if empty - " + tr2.isEmpty());
		String n=null;
		//System.out.println("null if empty - " + n.isEmpty());          //Null pointer Exception
		
		if(n==null) System.out.println("== empty try ");
		
		String bl=" ";
		System.out.println("blank space - " + bl.isEmpty());
		
		
// .concat
		String cc1="Heyy Peeps I am hereeeee";
		String cc2="Peeps";
		System.out.println("Concat - " + cc1.concat(cc2));
		
// .replace
		System.out.println(cc1.replace("am", "was"));
		System.out.println("try replace all - "+cc1.replaceFirst(cc1, "*"));
				
		
// .split
		System.out.println("Split case");
		String[] slt=cc1.split("\\s");
		for(String stt:slt) System.out.println(stt);
		String[] slt1=cc1.split("\\s",1);
		for(String stt:slt1) System.out.println(stt);
		
	//		String mail="saishruti05@gmail.com";
	//		String[] fst=mail.split("@");
	//		int l=fst[0].length();
	//		String mailfst=fst[0];
	//		String newstr="";
	//		for(int i1=1;i1<l-1;i1++) newstr+='*';
	//		System.out.println(newstr.concat());
		
// .intern
		
		
		
// .indexOf
		//		String cc1="Heyy Peeps I am hereeeee";
		//		String cc2="Peeps";
		System.out.println("index of - "+cc1.indexOf("e"));
		System.out.println("index of - "+cc1.indexOf("e",9));
		System.out.println("index of - "+cc1.indexOf("peeps"));
		System.out.println("index of - "+cc1.indexOf("am",9));

		
// .toLowerCase
		//		String cc2="Peeps";
		System.out.println("Lower Case - "+cc2.toLowerCase());
		
		
		
// .toUpperCase
		//		String cc2="Peeps";
		System.out.println("Upper Case - "+cc2.toUpperCase());
	}

}
