package conditions;

class Loop7 {
	public static void main(String[] args) {
		int a[][]=new int[2][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		int j;
		int i;
		for(i=0;i<a.length;i++)
		{
			for(j=2;j>=0;j--)
			{
				System.out.println(a[i][j]);
			}
	}
}
}
