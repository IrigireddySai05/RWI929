package day2_ArrayPractice_hw;

public class Ques32 {

	public static void main(String[] args) {
		int a[][] = {       
                {1, 2, 3},    
                {8, 6, 4},    
                {4, 5, 6}    
            };    
		int odd=0,even=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a[i][j]%2==0) even++;
				else odd++;
			}
		}
		System.out.print("Even - "+ even + " Odd - "+ odd);
	}

}
