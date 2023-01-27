package assignment2;

class Even5 {
public static void main(String[] args) {
	int i=1;
	for(i=1; i<=100; i++) {
		if(i%2==0 && i%5==0) {
			System.out.println("Divisible by 5 => "+i);
		}
		else if(i%2==0) {
			System.out.println(i);
		}
	}
}
}
