package day3;

class Animal{
	void eat() {
		System.out.println("kha raha hun");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.print("barking");
	}
}

public class Inhert_single {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.bark();
	}

}
