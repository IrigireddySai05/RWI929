package day2_ArrayPractice_hw;

import java.util.Arrays;

public class Ques14 {

	public static void main(String[] args) {
		int [] arr = new int [] {25, 11, 7, 75, 56};  
//		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int t=arr[j];
					arr[j]=arr[i];
					arr[i]=t;
				}
			}
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
	}

}
