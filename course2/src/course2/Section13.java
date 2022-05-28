package course2;

// 1.3 Type Casting

public class Section13 {
	
	public static void main(String args []) {
		// initial value as a Character
		char a = 'A';
		int b = a;
		float c = a;
		long d = a;
		double e = a;
		
		//implicit casting
		System.out.println("Printing value of character (a) = " + a);
		System.out.println("Printing value of a as an integer (b) = " + b);
		System.out.println("Printing value of a as an float (c) = " + c);
		System.out.println("Printing value of a as an long (d) = " + d);
		System.out.println("Printing value of a as an double (e) = " + e);
		
		//explicit casting
		int x = 10;
		double y = 20.0;
		
		System.out.println("This is explict casting when you multiple an int and a double " + x * y);
		System.out.println("This is implicit casting when you multiple an int and an int casting to a double " + (double)( x * x ));
		
	}

}
