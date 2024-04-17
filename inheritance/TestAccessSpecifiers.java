package inheritance;
import org.vinay.ChildAnotherPackage;
public class TestAccessSpecifiers {

	public static void main(String[] args) {
		ChildSamePackage c1=new ChildSamePackage();
		c1.displayChildSamePackage();
		System.out.println("=================");
		ChildAnotherPackage c2=new ChildAnotherPackage();
		c2.displayChildAnotherPackage();
	}
/* Private:only within the class.
 * Package private:Anywhere within the same Package.
 * Protected:In any package but in Sub class.(cant be accesed in another package with object reference)
 * Public:Anywhere in any package.
 */

 

}
