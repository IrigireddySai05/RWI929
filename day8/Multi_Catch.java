package day8;

public class Multi_Catch {

	public static void main(String[] args) {
		try {
			int a[]= new int[5];
			a[5]=30/0;
			System.out.println(a[10]);        // if both are given the first one exception is shown.
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception Shown");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception shown");
		}
		catch(Exception e) {
			System.out.println("Dont know which Excetion");
		}
		System.out.println("Rest of the code");
		
		
		
		
		
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception Shown");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception shown");
		}
		catch(Exception e) {
			System.out.println("Dont know which Excetion");
		}
		System.out.println("Rest of the code");
		
		
		
		
		
		try {
			int a[]= new int[5];
			a[5]=30/0;
		}
		catch(Exception e) {
			System.out.println("Dont know which Excetion");
		}
//		catch(ArithmeticException e){
//			System.out.println("Arithmetic Exception Shown");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array Index Out Of Bounds Exception shown");
//		}
		System.out.println("Rest of the code");
	}

}
