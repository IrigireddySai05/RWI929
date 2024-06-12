package day2_ArrayPractice_hw;

public class Ques9 {
	public static void main(String[] args) {
		int [] arr = new int [] {25, 11, 7, 75, 56};  
		int mx=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>mx) mx=arr[i];
		}
		System.out.print(mx);
	}
}
