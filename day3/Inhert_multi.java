package day3;

class Multi_Animal{
	String color="White";
	void eat() {
		System.out.println("Kha raha hun");
	}
}
class Lion extends Multi_Animal{
	String color="Yellow";
	void roar() {
		System.out.println("Roarrrrrrr....");
	}
}
class cub extends Lion{
	String color="Light Yellow";
	void give_color() {
		System.out.println(color);
		System.out.println(super.color);
	}
	
	void cuteRoar() {
		System.out.println("Cute sa Roarrrrr");
	}
}
public class Inhert_multi {

	public static void main(String[] args) {
		cub cutee=new cub();
		cutee.cuteRoar();
		cutee.roar();
		cutee.eat();
		cutee.give_color();
		

	}

}
