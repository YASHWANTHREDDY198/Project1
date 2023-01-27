package constructor;

public class Constructor {
		
		static {	System.out.println("SIB 1");	}
		
		static {	System.out.println("SIB 2");	}
		
		{	System.out.println("IIB 1");	}
		
		{	System.out.println("IIB 2");	}
		
		Constructor() {		System.out.println("Default Const");	}
		
		Constructor(boolean a) {	System.out.println("Boolean Arg Const=> "+ a);	}
		
		Constructor(int a, String b) {	System.out.println("Int & String Arg Const=> "+ a + " == "+b);	}
		
		Constructor(String a) {		System.out.println("String Arg Const=> "+ a);	}
		
		public static void main(String[] args) {
			System.out.println("Pgm starts");
			Constructor obj1 = new Constructor();
			System.out.println("Back to main");
			Constructor obj2 = new Constructor(10, "Hi");
			System.out.println("Back to main");
			Constructor obj3 = new Constructor(true);
			System.out.println("Back to main");
			Constructor obj4 = new Constructor("hello");
			System.out.println("Pgm ends");
		}

}
