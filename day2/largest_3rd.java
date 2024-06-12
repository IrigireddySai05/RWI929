package day2;

import java.util.Scanner;

public class largest_3rd {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Provide n");
		int n=sc.nextInt();
		System.out.println("Element of array");
		int[] arr= new int[n];
		for(int i=0;i<n;i++) arr[i]= sc.nextInt();
		int l=0,t=0;
		for(int i=0;i<n;i++) {
			l=t;
			for(int j=t;j<n;j++) {
				if(arr[l]<arr[j]) l=j;
			}
			int temp=arr[l];
			arr[l]=arr[t];
			arr[t]=temp;
			t++;
		}
		System.out.println(arr[2]);
		
	}

}

