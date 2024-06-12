package day2_ArrayPractice_hw;

import java.util.Arrays;

public class Ques21 {

	public static int RemoveDup(int arr[],int n) {
		if(n==0||n==1) return n;
		Arrays.sort(arr);
		int count=0;
		int id=1;
		for(int i=1;i<n;i++) {
			if(arr[i]!=arr[i-1]) {
				arr[id]=arr[i];
				id++;
			}
		}
		return id;
	}
	public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,40,50,50};  
        int n=arr.length;
        int l=RemoveDup(arr,n);
        for(int i=0;i<l;i++) System.out.print(arr[i]+" ");
	}

}
