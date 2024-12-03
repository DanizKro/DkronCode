package Uke40;

public class B1Klasser {

	public static void main(String[] args) {
		
		
		int b = 3;
		System.out.println(b);
		
		f(b);
		
		int nyb = f(b);
		
		System.out.println(b);
		
		
		
		
	}
	
	public static void f(int x ) {
		x = 2*x;
	}

}
