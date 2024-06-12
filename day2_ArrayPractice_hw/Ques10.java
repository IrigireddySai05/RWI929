package day2_ArrayPractice_hw;

public class Ques10 {

	public static void main(String[] args) {
		int [] arr = new int [] {25, 11, 7, 75, 56};  
		int mn=arr[0];
		for(int i=0;i<arr.length;i++) if(arr[i]<mn) mn=arr[i];
		System.out.print(mn);

	}

}
