package day2_ArrayPractice_hw;

public class Ques17 {

	public static void main(String[] args) {
		int [] arr = new int [] {25, 11, 7, 75, 56};  
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]<arr[j]) {
					int t=arr[j];
					arr[j]=arr[i];
					arr[i]=t;
				}
		System.out.print(arr[1]);
	}

}
