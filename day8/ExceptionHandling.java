package day8;

public class ExceptionHandling {

	public static void main(String[] args) {
// Arithmetic		
		try {
			int d=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("AE OUT");
// Null pointer		
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}

		System.out.println("NPE OUT");
// Array Index out of Bound		
		try {
			int a[]=new int[4];
			a[5]=5;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("AIOB OUT");
		
//Number Format 		
		try {
			String s1="abs";
			int i=Integer.parseInt(s1);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		
		System.out.println("NFE OUT");
		

	}

}
