package class25;

class Largenum {
public static void main(String[] args) {
	int arr[]= {10,50,20,60,30,40};
	int f=arr[0];
	int s=arr[0];
	for(int i=1;i<arr.length;i++) {
	if(f < arr[i]) {
		f=arr[i];
	}
	if(s<arr[i]) {
		s=arr[i-1];
	}
}
	System.out.println(f);
	System.out.println(s);
}
}
