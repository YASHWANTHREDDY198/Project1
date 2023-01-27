package class30;
class A1{
	A1(){
		System.out.println("A1 default constructor");
	}
	A1(int a){System.out.println("A1 int arg constructor"+ a);
}
}
class A2 extends A1{
	A2(){
		System.out.println("A2 default constructor");
	}
	A2(String a){
		System.out.println("A2 default constructor"+ a);
	}
	A2(int a, double b){
		super(200);
		System.out.println("A2 int and double constructor"+a+"=="+b);
	}
}
class A3 extends A2{
		A3(){
			System.out.println("A3 default constructor");
		}
		A3(boolean a){
			super(500 ,700.55);
			System.out.println("A3 Boolean Constructor"+ a);
		}
		A3(String a, double b){
			System.out.println("A3 String and double constructor"+a +"===="+ b);
		}
}
class Superclass {
public static void main(String[] args) {
	System.out.println("pgm starts");
	A3 obj1 = new A3(false);
	System.out.println("pgm ends");
}
}
