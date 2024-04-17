package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* To sort custom class objects , then that class should be implement the comparable with 
 * generic of that class type should implement the compareTo(Object o) of that class type
 * then comparision between this.--- and o.--- should be compared and returns -ve and +ve values
 * ***Drawback***
 * We can only sort based on any one type , because the class implements the comparable.
 * whereas in comparator our wanted type will implement the comparator both times , thus allows
 * us to sort in our wanted type.
 */

public class SortVthStudentimplementsComparable {

	public static void main(String[] args) {
		ArrayList<Student2> list=new ArrayList(List.of(new Student2(4,"vinay"), new Student2(2,"mama"),new Student2(1,"manvik"), new Student2(3,"manu")));
		System.out.println("***Before sorting***");
		System.out.println(list);
		System.out.println("***After Sorting***");
		Collections.sort(list);
		
		for(Student2 list1: list) {
			System.out.println(list1);
		}
		
	}

}
class Student2 implements Comparable<Student2>{
	private int id;
	private String name;
	Student2(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "Student ["+this.id+" , "+this.name+"]";
	}
	@Override
	public int compareTo(Student2 o) {
		return this.name.compareTo(o.name); //based on name
		//return this.id - o.id; //based on age
	}
}
