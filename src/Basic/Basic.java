package Basic;

public class Basic {
	//2 static variables
	static int a=1;
	static int b=5;
	//2 non static variables
	int c=10;
	int d=15;

	public static void main(String[] args) {
	//3 local variables
		int a=3;
		int c=7;
		int x=9;
	//print local variables	
		System.out.println(a);
		System.out.println(c);
		System.out.println(x);
	//print static variables
		System.out.println(Basic.a);
		System.out.println(Basic.b);
	//print non-static variables
		Basic obj = new Basic();
		System.out.println(obj.c);
		System.out.println(obj.d);
		
	}

}
