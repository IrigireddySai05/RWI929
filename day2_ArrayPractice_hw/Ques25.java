package day2_ArrayPractice_hw;

public class Ques25 {

	public static void main(String[] args) {
		int original[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int[][] transpose= new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				transpose[i][j]=original[j][i];
				System.out.print(transpose[i][j]+" ");
			}
		System.out.println();
		}
	}

}
