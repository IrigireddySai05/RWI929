package day2;

public class Ques1_for {

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
	        for(int j=0;j<3;j++){
    	        if(i%2==0) System.out.print("* ");
    	        else if((i<5/2 && j==0) ||(i>5/2 && j==2)) System.out.print("* ");
    	        else System.out.print("  ");
	        }
	        System.out.println("");
		}
	}

}
