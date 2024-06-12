package day2_ArrayPractice_hw;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		System.out.println("Provide n");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Elements");
		int[] arr= new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int f=arr[0];
		for(int i=0;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[n-1]=f;
		for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
	}

}
