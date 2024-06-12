package day2_ArrayPractice_hw;

public class Ques31 {

	public static void main(String[] args) {
		int a[][] = {       
                {1, 2, 3},    
                {8, 6, 4},    
                {4, 5, 6}    
            };    
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i>j) a[i][j]=0;
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}

}
