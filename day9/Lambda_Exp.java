package day9;

import java.util.ArrayList;
import java.util.List;

interface Drawable{
	public void draw();
}
interface Sayable{
	public void say();
}
interface Saying{
	public String say(String name);
}
interface adding{
	int add(int a,int b);
}
interface msgSaying{
	String say(String msg);
}


public class Lambda_Exp {

	public static void main(String[] args) {
		
		
		
// without lambda		
		int width=20;
		//		Drawable d=new Drawable() {
		//			public void draw(){System.out.println("Width - "+ width);}
		//		};
		//		d.draw();
		//	}

// with 
		Drawable d2=()->{
			System.out.println("Width(lambda) - "+ width);
		};
		d2.draw();
		
// sayable interface		
		Sayable s=()->{
			System.out.println("Im saying");
		};
		s.say();
		
// saying interface
		Saying sa=(name)->{
			return name + " is saying";
		};
		System.out.println(sa.say("Akshay"));
		
		
// adding interface with return keyword
		adding ad=(a,b)->{
			return a+b;
		};
		System.out.println(ad.add(2,7));
// without return keyword
		adding ad2=(a,b)->(a+b);
			System.out.println(ad2.add(5, 1));
			
			
		List<String> ls=new ArrayList();
		ls.add("Apple");
		ls.add("Samsung");
		ls.add("OnePlus");
		ls.add("noise");
		
		ls.forEach(
			(n)->System.out.println(n)
			);
		
// msg saying
		msgSaying m=(msg)->{
			String sq="Yo peeps its mee";
			String mg=sq;
			return mg+ msg;
		};
		System.out.println(m.say(", Shruti!!"));
		

		
	}
}
