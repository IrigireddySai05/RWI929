package day2;

import java.util.*;


public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("Provide n-");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Provide elements of array-");
		int[] arr= new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		System.out.println("Provide number to be found-");
		int findInt= sc.nextInt();
		int flag=0;
		Arrays.sort(arr);
		int l=0,r=n-1;
		while(l<=r) {
			int m=(l+(r-l)/2);
			if(arr[m]==findInt) {
				System.out.println("Number found");
				flag=1;
				break;
			}
			else if(arr[m]<findInt) l=m+1;
			else r=m-1;
		}
		if(flag==0) System.out.println("Number Not FOUND");
		

	}

}
