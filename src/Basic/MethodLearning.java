package Basic;

class MethodLearning {
	void m1() {
	System.out.println("Default method with no return value");
	return; }
	int m2() {
	System.out.println("Default method with Int return value");
	return 100; }
	boolean m3 () {
	System.out.println("Default method with Boolean return value");
	return true;
	}
	void m1(int a) {
	System.out.println("Int Arg method with no return value=> "+ a);
	}
	double m1(int a, String b) {
	System.out.println("Int & String Arg method with double return value=> "+ a +"=="+ b);
	return 10.30;
	}
	public static void main(String[] args) {
	MethodLearning obj = new MethodLearning();
	obj.m1();
	int a= obj.m2();
	boolean b= obj.m3();
	obj.m1(1500);
	double c = obj.m1(150, "Hello");
	System.out.println(a+"=="+b+"=="+c);
	}
}
