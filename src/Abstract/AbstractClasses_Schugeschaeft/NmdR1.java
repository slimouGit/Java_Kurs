package AbstractClasses_Schugeschaeft;

public class NmdR1 extends Adidas {
	
	public NmdR1(String sole, String material, String color, boolean waterproof) {
		super(sole, material, color, waterproof);
	}
	
	public void tieShoes() {
		System.out.println(getBrand() + " wird gebunden.");
	}
	
}
