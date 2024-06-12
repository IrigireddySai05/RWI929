package day2_ArrayPractice_hw;

public class Ques28 {

	public static void main(String[] args) {
		 int a[][] = {       
                 {4, 0, 0},    
                 {0, 5, 0},    
                 {0, 0, 6}    
             }; 
		 int zero=0;
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++) if(a[i][j]==0) zero++;
		 }
		 if(zero>((3*3)/2)) System.out.print("Sparse"); 
		 else System.out.print("Nhiii");
	}

}
