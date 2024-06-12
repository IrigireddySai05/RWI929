package day8;

public class Nested_try {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("gng to divide by 0");
				int b=55/0;
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception Found");
			}
			try {
				int a[]=new int[5];
				a[5]=4;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e+" FOUND");
			}
			
			System.out.println("Inner Try ktm");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Bahar aa gaya");
		
		
		
		
		
		
		
		
		
		try {
			try {
				try {
					int arr[]= {1,2,3,4};
					System.out.println(arr[8]);
				}
				catch(ArithmeticException e) {
					System.out.println("Arithmetic Exception");
					System.out.println("Inside Try2");
				}
			}
			catch (ArithmeticException e) {  
                System.out.println("Arithmetic exception");  
                System.out.println("inner try 1");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception");  
            System.out.println("outer try");
		}
		catch(Exception e) {
			System.out.println("Exception");  
            System.out.println("outer try");
		}
		
	}

}
