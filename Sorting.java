package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* If we want sort a list of elements there is no need to extend or implement any classes
 * we just need to call the Collections.sort(list) method and should pass the elements reference in it
 */

public class Sorting{

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>(List.of("1","3","9","2","vinay","mama"));
		System.out.println("***Before sorting***");
		System.out.println(list);
		System.out.println("***After Sorting***");
		Collections.sort(list);
		System.out.println(list);
	}

}
