package day3;

class Bike{
	void run() {
		System.out.println("Normal Bike hai");
	}
	static void stop() {
		System.out.println("Bike Stop");
	}
}
class Splender extends Bike{
	void run() {
		System.out.println("Splender hai");
	}
	static void stop() {
		System.out.println("Splender Stop");
	}
}
public class Casting_oops {

	public static void main(String[] args) {
		Bike bk = new Splender();
		bk.run();
		bk.stop();
	}

}
