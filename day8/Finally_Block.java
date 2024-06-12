package day8;

public class Finally_Block {

	public static void main(String[] args) {
		try {
			int data=25/5;
			System.out.println(data);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally executed");
		}
		System.out.println("Code over");
		
		
		
		
//		
//		
//		try {
//			int data=25/0;
//			System.out.println(data);
//		}
//		catch(NullPointerException e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("Finally executed");
//		}
//		System.out.println("Code over");
//		
//		
//		
		
		
		try {
			int data=25/0;
			System.out.println(data);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally executed");
		}
		System.out.println("Code over");
	}

}
