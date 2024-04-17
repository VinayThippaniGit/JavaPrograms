package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Cursor {

	public static void main(String[] args) {
		LinkedList lList=new LinkedList();
		System.out.println(lList);
		lList.add(10);
		lList.add(20);
		lList.add(30);
		lList.add(40);
		lList.add(50);
		lList.add(60);
		lList.add(2,25);
		lList.addFirst(1);
		lList.addLast(100);
		//System.out.println(lList.contains(50));
		//System.out.println(lList);
		
		ListIterator it=lList.listIterator();
		System.out.println(lList);
		while(it.hasNext()) {
			if(it.next().equals(10)) {
				it.set(11);
			}
		}
		System.out.println(lList);
		
	}

}

