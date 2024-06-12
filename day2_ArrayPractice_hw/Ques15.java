package day2_ArrayPractice_hw;

public class Ques15 {

	public static void main(String[] args) {
		int [] arr = new int [] {25, 11, 7, 75, 56}; 
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int t=arr[j];
					arr[j]=arr[i];
					arr[i]=t;
				}
			}
		
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
	}

}
