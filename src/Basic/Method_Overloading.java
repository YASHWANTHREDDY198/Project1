package Basic;

class Method_Overloading {
	void sample() {
		System.out.println("Sample Default method");
	}
	void sample(int a) {
		System.out.println("Sample Int Arg method "+ a);
	}
	double sample(int a, double b) {
		System.out.println("Sample Int & Double Arg method "+ a + "==="+ b) ;
		return b;
	}
	boolean sample(double a,int b) {
		System.out.println("Sample Double & Int Arg method "+ a + "==="+ b);
		return true;
	}

	String sample(String a,String b) {
		System.out. println("Sample String & String Arg method "+ a + "==="+ b);
		return a+"=="+b;
	}
	public static void main(String[] args) {
		Method_Overloading obj1 = new Method_Overloading();
		double var= obj1.sample(100, 10.50);
		obj1.sample();
		
}
}