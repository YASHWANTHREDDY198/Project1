package list;
import java.util.ArrayList;
class Arraylist {
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add("A");
		list.add(1234);
		list.add(12.50);
		list.add(1234);
		list.add(null);
		list.add(true);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.size());
		System.out.println(list.contains("A"));
		System.out.println(list.contains("B"));
		System.out.println(list.remove(2));
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.lastIndexOf(1234));
		
}
}