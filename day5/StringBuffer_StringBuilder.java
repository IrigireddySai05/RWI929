package day5;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
// String BUffer
		StringBuffer buffer=new StringBuffer("Java");
		buffer.append(" Seekhoo");
		System.out.println(buffer);
		
		
		
// String Builder
		StringBuilder builder=new StringBuilder("Java");
		builder.append("Sheekleee");
		System.out.println(builder);
		
		
//	Compare String Buffer and String Builder
		long StartTime= System.currentTimeMillis();
		StringBuffer sb= new StringBuffer("Java");
		for(int i=0;i<100000;i++) sb.append(" Time Taken");
		System.out.println("Time Taken while String Buffer " + (System.currentTimeMillis()-StartTime) + " ms");
		StartTime=System.currentTimeMillis();
		StringBuilder sb2=new StringBuilder("Java");
		for(int i=0;i<100000;i++) sb.append(" Time Taken");
		System.out.println("Time Taken while String Builder " + (System.currentTimeMillis()-StartTime)+ " ms");
		
	}

}
