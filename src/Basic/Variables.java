package Basic;

public class Variables {
//1 static variable
	static int a=1;
//1 non static variable
	int c=2;
public static void main(String[] args) {
//local variables
	int a=5;
	int x=6;
//create new object
	Variables obj = new Variables();
//print values with variable-name
	System.out.println(a);
	System.out.println(x);
//object-name
	System.out.println(obj.c);
//class-name
	System.out.println(Variables.a);
}
}
