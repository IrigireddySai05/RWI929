package day3;

class Hierar_Animal{
	void eat() {
		System.out.println("Kuch toh kha raha hun");
	}
}
class Rabbit extends Hierar_Animal {
	void jump() {
		System.out.println("Jumpingggg");
	}
}
class Snake extends Hierar_Animal{
	void crawl() {
		System.out.println("Hizzzzz");
	}
}
public class Inhert_hierar {

	public static void main(String[] args) {
		System.out.println("Rabbit------");
		Rabbit rb= new Rabbit();
		rb.jump();
		rb.eat();
		System.out.println("Snake----");
		Snake sk= new Snake();
		sk.crawl();
		sk.eat();
		

	}

}
