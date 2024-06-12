package day2;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		System.out.println("Provide n- ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Provide array elements");
		int[] arr= new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		System.out.println("Provide number to be found");
		int findInt= sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==findInt) {
				System.out.println(i);
				flag=1;
			}
		}
		if(flag==0) System.out.println("Not found");
		
	}

}

