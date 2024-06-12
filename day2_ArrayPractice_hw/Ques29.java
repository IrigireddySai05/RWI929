package day2_ArrayPractice_hw;

public class Ques29 {

	public static void main(String[] args) {
		int a[][] = {       
                {1, 2, 3},    
                {8, 4, 6},    
                {4, 5, 7}    
            };    
      
  //Initialize matrix b    
		int b[][] = {       
                {1, 2, 3},    
                {8, 8, 6},    
                {4, 5, 7}    
		};    
		int flag=0;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++) if(a[i][j]!=b[i][j]) {
				flag=1;
				break;
			}
		if(flag==0) System.out.print("Same Same");
		else System.out.print("Nhiii");
	}

}
