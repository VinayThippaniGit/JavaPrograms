package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*We need to write separate classes implementing the comparator of our wanted type to sort
 *and that class needs to be passed as object in collections.sort(ref name,class object()). 
 */
public class SortVthStudentimplementsComparator {
	public static void main(String[] args) {
		ArrayList<Student3> list=new ArrayList(List.of(new Student3(4,"vinay"), new Student3(2,"mama"),new Student3(1,"manvik"), new Student3(3,"manu")));
		System.out.println("***Before sorting***");
		System.out.println(list);
		System.out.println("***After Sorting***");
		
		System.out.println("Sorting by Id Ascending");
		Collections.sort(list,new IdComparator());
		for(Student3 list1: list) {
			System.out.println(list1);
		}
		System.out.println("\n Sorting by Name in descending order");
		Collections.sort(list , new NameComparator());
		for(Student3 s:list) {
			System.out.println(s);
		}
		
	}
}
class Student3{
	private int id;
	private String name;
	Student3(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "Student ["+this.id+" , "+this.name+"]";
	}
}
class IdComparator implements Comparator<Student3>{

	@Override
	public int compare(Student3 o1, Student3 o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	
}
class NameComparator implements Comparator<Student3>{
	public int compare(Student3 o1, Student3 o2) {
		return -o1.getName().compareTo(o2.getName());
	}
}

