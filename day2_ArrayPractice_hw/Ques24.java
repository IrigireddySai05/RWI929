package day2_ArrayPractice_hw;

public class Ques24 {

	public static void main(String[] args) {
		int arr[]={1,2,5,6,3,2};  
		System.out.println("ODD numbers");
		for(int i=0;i<arr.length;i++) if(arr[i]%2!=0) System.out.println(arr[i]);
		System.out.println("EVEN numbers");
		for(int i=0;i<arr.length;i++) if(arr[i]%2==0) System.out.println(arr[i]);
	}

}
