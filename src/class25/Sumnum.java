package class25;

class Sumnum {
	public static void main(String[] args) {
		int n=5;
		int fact=0;
		for(int i=1;i<=n;i++){
			fact=i+fact;
		}
		System.out.println(fact);
	}
}
