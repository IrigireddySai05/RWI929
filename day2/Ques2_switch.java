package day2;

import java.util.Scanner;

public class Ques2_switch {

	public static void main(String[] args) {
		System.out.println("Provide age- ");
		Scanner ageInp = new Scanner(System.in);
		int age=ageInp.nextInt();
		int res = age >= 18 ? 1 : 0;
		switch(res) {
			case 1: 
				System.out.println("Eligible to vote");	
				break;
			case 0: 
				System.out.println("Not eligible to vote");
				break;
		}
	}
	
}
