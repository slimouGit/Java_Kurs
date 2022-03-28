package Constructor;

public class OverloadingTest {
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		
		Dog dog2 = new Dog("Gaston");
		
		Dog dog3 = new Dog("Gaston", "Münsterländermischling");
		
		Dog dog4 = new Dog("Gaston", "Münsterländermischling", 16);
		
		System.out.println("D1 "+ dog1);
		System.out.println("D2 "+ dog2);
		System.out.println("D3 "+ dog3);
		System.out.println("D4 "+ dog4);
		
	}

}
