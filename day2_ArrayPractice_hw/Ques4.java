package day2_ArrayPractice_hw;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
//		int[] arr=new int[n];
//		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(arr[i]==arr[j]) System.out.print(arr[j]+" ");

	}

}
