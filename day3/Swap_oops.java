package day3;

public class Swap_oops {
	public static int[] swap(int arr[]) {
		int t=arr[0];
		arr[0]=arr[1];
		arr[1]=t;
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {40,31};
		for(int i=0;i<2;i++) System.out.print(arr[i] + " ");
		System.out.println();
		int[] newar=swap(arr);
		for(int i=0;i<2;i++) System.out.print(newar[i] + " ");
		
	}

}
//string, int- immutable hota hai. naya var ban jata hai....
// array arr... same arr mein changes hota hai..