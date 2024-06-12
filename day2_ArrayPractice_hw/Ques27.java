package day2_ArrayPractice_hw;

public class Ques27 {

	public static void main(String[] args) {
		int a[][] = {       
                {1, 0, 0},    
                {0, 1, 0},    
                {0, 1, 1}    
            }; 
		int flag=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if((i!=j && a[i][j]==0) || (i==j && a[i][j]==1)) continue;
				else flag=1;
			}
		}
		if(flag==0) System.out.print("Identity matrix");
		else System.out.print("Nhiiii");
	}

}
