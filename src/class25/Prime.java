package class25;
import java.util.*;
class Prime {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter a number");
	int n= s.nextInt();
	boolean status=true;
	for(int j=0;j<=n;j++) {
	for(int i=2;i<n;i++){
		if(n%i==0){
			System.out.println(n+ "is not a prime");
			status=false;
			break;
		}
	}
if(status==true) {
	System.out.println(n +"is a prime number");
}
	}
}
}