package day2_ArrayPractice_hw;

import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		for(int i=0;i<n;i=i+2) System.out.print(arr[i]+" ");
	}

}
