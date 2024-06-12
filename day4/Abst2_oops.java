package day4;

abstract class Parent{
	abstract void career();
	abstract void subj();
}
class Son extends Parent{
	@Override
	void career() {
		System.out.println("Career");
	}

	@Override
	void subj() {
		System.out.println("Subject");
	}
}
public class Abst2_oops {

	public static void main(String[] args) {
		Parent pt=new Son();
		pt.career();
		pt.subj();
	}

}
