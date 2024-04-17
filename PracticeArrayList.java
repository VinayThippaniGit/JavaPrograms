package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PracticeArrayList {

	public static void main(String[] args) {
// if we dont use generics by default it will take its generic as object , so therefore making it heterogeneous to store all type of data
//i.e --> ArrayList<Object> list=new ArrayList<Object>();		
		
		ArrayList list=new ArrayList();
		System.out.println(list);//initially the list was empty
		
		list.add(10); //list.add(new Integer(10)) primitive is automatically converted into object with autoboxing
		list.add(20);
		list.add(30);
		list.add(40);
		list.add("vinay");
		System.out.println(list);
		
		ArrayList list2=new ArrayList();
		list2.add(new Student(501,"Vinay"));
		System.out.println(list2);
		
		list2.add(new Student(502,"Mamatha"));
		System.out.println(list2);
		
		list2.toString(); //No change same prints the objects addresses only
		System.out.println("To String "+list2);
		
		//Adding elements at wanted index
		list.add(2,25);
		System.out.println(list);
		
		list2.add(1,new Student(1000,"Manvi"));
		System.out.println(list2);
		
		//Adding another collection object
		list.addAll(list2);
		System.out.println(list);
		
		///Adding another collection object at 0 index
		list.addAll(0, list2);
		System.out.println(list);
		
		ArrayList cloneList=(ArrayList)list.clone();
		System.out.println("Clone list "+list);
		
		System.out.println(list.contains("Mamatha"));
		System.out.println(list.contains(25));
		
		//for intitial capacity
		ArrayList list3=new ArrayList(5);
		list3.ensureCapacity(6);
		System.out.println(list3.size()); //prints 0
		
		//list.get(index) getting element of particular index value of required list
		System.out.println(list.get(4));
		
		//whether the list is empty or not
		System.out.println(list.isEmpty());
		
		//ArrayList as candidate for for-each loop
		System.out.println(list.iterator());
		
		//creating iterator object on list.iterator of Iteartor type to access Iterator methods
		Iterator iterator=list.iterator();
		//hasNext() returns boolean value if there exists any next elements
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
			Object obj=iterator.next();
			if(obj.equals(25)) { //25 willl be removed
				iterator.remove();
			}
		}
		
		System.out.println(list);
		
//		for(Object obj:list) {
//			System.out.println(obj);
//		}
		
		list.removeAll(list2); //removes wanted collection from the list
		System.out.println(list);
		
		//Allows null,multiple nulls and duplicated values
		list.add(10);
		list.add(10);
		list.add(null);
		list.add(null);
		System.out.println(list);
		
		//if there are duplicate objects returns last index value of that duplicate object
		System.out.println(list.lastIndexOf(10)); //6
		
		ListIterator listIterator=list.listIterator();
		while(listIterator.hasNext()) {
//			Object item=(Object)listIterator.next();
//			if(item.equals(40)) {
//				listIterator.set(45);
//			}
			
			System.out.print(listIterator.next()+" ");
		}//the iteration value will be moved to last index value
		
		System.out.println();
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous()+" ");
		}
		
		System.out.println();
		list.set(7, 7);
		System.out.println(list);
		list.retainAll(cloneList);//will keep the elements that are matching only
		//value 7 and null will be removed as they are not there in clone list
		System.out.println(list);
		
		System.out.println("size of list - "+list.size());
		list.remove(4);
		
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
	}

}
class Student{
	int id;
	String name;
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
//	@Override //to override the toString method which converts the addresses to Stint format int the list
//	public String toString() {
//		return "Student [id=" +id+ ",name="+name+"]";
//	}
}
