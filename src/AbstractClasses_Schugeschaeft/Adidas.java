package AbstractClasses_Schugeschaeft;

public abstract class Adidas extends AbstractClasses_Schugeschaeft.Shoe {
	
	private String brand = "Adidas";
	private int guaranteeInDays = 29;
	
	public Adidas(String sole, String material, String color, boolean waterproof) {
		super(sole, material, color, waterproof);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getGuaranteeInDays() {
		return guaranteeInDays;
	}

	public void setGuaranteeInDays(int guaranteeInDays) {
		this.guaranteeInDays = guaranteeInDays;
	}
}
