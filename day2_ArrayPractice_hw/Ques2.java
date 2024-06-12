package day2_ArrayPractice_hw;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
//		int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
		int[] freq=new int[n];
		int count;
		for(int i=0;i<n;i++) {
			count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) { count++;
				freq[j]=-1;}
			}
			if(freq[i]!=-1) freq[i]=count; 
		}
		for(int i=0;i<n;i++){
			if(freq[i]!=-1) {
				System.out.println(arr[i]+"	" +freq[i]);
			}
		}
	}

}
