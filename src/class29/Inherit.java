package class29;

class A1{
	static int a= 100;
	static int b= 200;
	static void m1() {
		System.out.println("M1 method from A1");	}
	 static void m2() {
		System.out.println("M2 method from A1");	}
}
class A2 extends A1{
	/*static*/ int b= 300;
	static int c= 400;
	static void m2() {
		System.out.println("M2 method from A2");	}
	static void m3() {
		System.out.println("M3 method from A2");	}
}
class Inherit {
	public static void main(String[] args) {
		System.out.println("Pgm starts");
		//A1 obj1= new A1();
		System.out.println(A1.a);
		System.out.println(A1.b);
		A1.m1();
		A1.m2();
		A2 obj2= new A2();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj2.c);
		obj2.m1();
		obj2.m2();
		obj2.m3();
		System.out.println(A2.a);
		System.out.println(obj2.b);
		System.out.println(A2.c);
		A2.m1();
//		A2.m2();
		A2.m3();
		A1 obj3= new A2();
		obj3.m2();
		System.out.println(obj3.b);
	}
}
