package day8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Try_Catch {

	public static void main(String[] args) {
		try {
			int d=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("REST of the Code");
		
		
		try {
			int d=10/0;
			System.out.println("REST of the Code");

		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		
		
		try {
			int d=10/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("REST of the Code");
		
		
		
		try {
			int d=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		System.out.println("REST of the Code");
		
		
		
		
		int i=0,j=24;try {
			int d=j/i;
		}
		catch(ArithmeticException e) {
			System.out.println(j/(i+2));
		}
		System.out.println("REST of the Code");
		
		
		
		//		
		//		try {
		//			int d=10/0;
		//		}
		//		catch(ArithmeticException e) {
		//			int c=20/0;
		//		}
		//		System.out.println("REST of the Code");
		//
		//		
		
		//		
		//		
		//		try {
		//			int d=10/0;
		//		}
		//		catch(ArrayIndexOutOfBoundsException e) {
		//			System.out.println(e);
		//		}
		//		System.out.println("REST of the Code");
		//		
		//		
		//		
		//		
		
		
		try {
			int arr[]= {3,5,1,6,9};
			System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("REST of the Code");
		
		
		
		
		
// checked Exception
		PrintWriter pw;
		try {
			pw=new PrintWriter("try.txt");
			pw.println("saved");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("File Saved Successfully");
		
	}

}
