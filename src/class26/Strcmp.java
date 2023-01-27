package class26;

class Strcmp {
public static void main(String[] args) {
	String str= "The rains have started here";
	String str1= "The rains Have started here";
	System.out.println(str.equals(str1));
	System.out.println(str.equalsIgnoreCase(str1));
	System.out.println(str);
	String temp[]=str.split(" ");
	System.out.println(temp.length);
	for(int i=0;i<temp.length;i++) {
		
	}
}
}
