package day2_ArrayPractice_hw;

public class Ques33 {

	public static void main(String[] args) {
		int a[][] = {    
                {1, 3, 2},    
                {3, 1, 1},    
                {1, 2, 2}    
             };    
    
//Initialize matrix b    
		int b[][] = {    
                {2, 1, 1},    
               {1, 0, 1},    
               {1, 3, 1}    
           };    

		int c[][] = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				int t=0;
				for(int k=0;k<3;k++) {
					t+=a[i][k]*b[k][i];
				}
				c[i][j]=t;
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}
