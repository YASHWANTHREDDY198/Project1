package assignment2;

class Pyramid1 {
public static void main(String[] args) {
		for(int i=3; i>=1;i--) {
		for(int j=4;j>=1;j--) {
			System.out.print("1");
		}
		System.out.println();
		}
	System.out.println("--------------------");
		for(int i=3; i>=1;i--) {
		for(int j=4;j>=1;j--) {
			System.out.print(i);
		}
		System.out.println();
		}
		System.out.println("--------------------");
		for(int i=1; i<4;i++) {
		for(int j=1;j<=4;j++) {
			System.out.print(j);
		}
		System.out.println();
		}
	System.out.println("--------------------");
	for(int i=3; i>=1;i--) {
		for(int j=4;j>=1;j--) {
			System.out.print(j);
		}
		System.out.println();
		}
	System.out.println("--------------------");
	for(int i=1; i<=4;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}	
	System.out.println("--------------------");
	for(int i=4; i>=1;i--) {
		for(int j=4;j>=i;j--) {
			System.out.print(j);
		}
		System.out.println();
	}
	System.out.println("--------------------");
	for(int i=4; i>=1;i--) {
	for(int k=1; k<i;k++) {
		System.out.print(" ");
	}
	for(int j=4;j>=i;j--) {
		System.out.print(j);
	}
	System.out.println();
	}
	System.out.println("--------------------");
	for(int i=1; i<=4;i++) {
	for(int k=3; k>=i;k--) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print(i);
	}
	System.out.println();
	}
	System.out.println("--------------------");
	for(int i=4; i>=1;i--) {
		for(int j=4;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("--------------------");
	/*for(int i=1; i<=4;i++) {
	for(int k=3; k>=i;k--) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}
	System.out.println();
	}*/
	
	/*for(int i=3; i>=1;i--) {
			for(int j=3;j>=i;j--) {
				System.out.print(i);
			}
			System.out.println();
			}
	System.out.println("--------------------");
		for(int i=3; i>=1;i--) {
			for(int j=3;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
			}*/
}
}