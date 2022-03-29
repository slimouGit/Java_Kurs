package HashCode;

public class HashTest {
	
	public static void main(String[] args) {
		
		User user1 = new User("slimou", 42, "111222333");
		User user2 = new User("slimou", 42, "111222333");
		
		
		System.out.println(user1.equals(user2));
		System.out.println("user1.hashCode() "+user1.hashCode());
		System.out.println("user2.hashCode() "+user2.hashCode());
	}

}
