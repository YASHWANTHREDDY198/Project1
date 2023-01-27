package Basic;

class Functions {
	static void m1() {
		System.out.println("M1 method");
		return;	}
	static boolean m2() {
		System.out.println("m2 method");
		return true;
	}
public static void main(String[] args) {
	System.out.println("pgm starts");
	Functions.m1();
	System.out.println("Back to main");
	boolean a = Functions.m2();
	
}
}
