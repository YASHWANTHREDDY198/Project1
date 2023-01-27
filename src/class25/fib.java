package class25;

class fib {
public static void main(String[] args) {
	int prev=0;
	int curr=1;
	System.out.println(prev);
	System.out.println(curr);
	for(int i=0; i<10;i++)
	{
		int fib=prev+curr;
		System.out.println(fib);
		prev=curr;
		curr=fib;
	}
}
}
