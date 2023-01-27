package conditions;

class Array2 {
public static void main(String[] args) {
	int a[][]=new int[3][2];
	a[0][0]=100;
	a[0][1]=200;
	a[1][0]=300;
	a[1][1]=400;
	a[2][0]=500;
	a[2][1]=600;
	int i;
	int j;
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a[0].length;j++)
		{
			System.out.println(a[i][j]);
		}
	}
}
}
