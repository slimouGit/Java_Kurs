package Equal;

public class EqualTest {
	
	public static void main(String[] args) {
		Moof one = new Moof(42);
		Moof two = new Moof(42);
		
		if(one.equals(two)) {
			System.out.println("one and two are equal");
		}else {
			System.out.println("one and two are not equal");
		}
	}

}
