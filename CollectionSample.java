package collection;

import java.util.ArrayList;

public class CollectionSample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj = new ArrayList();
		obj.add(10);
		obj.add(18);
		obj.add(26);
		obj.add(7.8f);
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Mango");
		obj.add('a');
		obj.add('z');
		obj.add('q');
		System.out.println(obj); //Generalised Array any one can be accomodated
		ArrayList<Integer> obj1 = new ArrayList();
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		obj1.add(4);
	//	obj1.add("Hello");  //Not generalised array strings cannot be implemented
		System.out.println(obj1);
		ArrayList<String> obj2 = new ArrayList();
		obj2.add("Tomato");
		obj2.add("Carrot");
		obj2.add("Potato");
		//obj2.add(4);
		System.out.println(obj2);
	}
}
