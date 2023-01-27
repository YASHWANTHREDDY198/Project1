package constructor;

class A1 {
	A1(){
		System.out.println("default constructor ");
	}
	A1(int a){
		System.out.println("pass an integer ");
	}
	A1(String a,String b, String c ){
		System.out.println("string "+a+b+c);
	}
public static void main(String[] args) {
	A1 obj1= new A1();
	A1 obj2= new A1(10);
	A1 obj3= new A1(" hi "," hello "," hey ");
	A1 obj4= new A1(" hello "," sahi "," yash ");
}
}
