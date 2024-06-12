package day4;


//  https://www.javatpoint.com/abstract-class-in-java
// example 1
//abstract class Bike{
//	abstract void run();
//}
//class Honda extends Bike{
//	void run(){
//		System.out.println("running safely");
//	}
//}



//Example 2
//abstract class Shape{
//	abstract void draw();
//}
//
//class Circle extends Shape{
//	void draw() {
//		System.out.print("drawing circle");
//	}
//}
//class Rect extends Shape{
//	void draw() {
//		System.out.print("drawing Reactangle");
//	}
//}




//Example 3
//abstract class Bank{
//	abstract int interest();
//}
//class SBI extends Bank{
//	int interest() {
//		return 7;
//	}
//}
//class PNB extends Bank{
//	int interest() {
//		return 6;
//	}
//}





//Example 4
abstract class Bike{
	void bike(){
		System.out.println("Bike is created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("gear changed");
	}
}
class Jawa extends Bike{
	void run() {
		System.out.println("Jawa Running");
	}
}
public class Abst_oops {

	public static void main(String[] args) {
//		Bike bk=new Honda();
//		bk.run();
		
		
//		Shape s=new Circle();
//		s.draw();
		
		
//		Bank bk;
//		bk=new SBI();
//		int inrst=bk.interest();
//		System.out.println("SBI- "+inrst+"%");
//		bk=new PNB();
//		inrst=bk.interest();
//		System.out.println("PNB- "+inrst+"%");
		
		
		Bike bk=new Jawa();
		bk.run();
		bk.changeGear();
		bk.bike();
	}

}
