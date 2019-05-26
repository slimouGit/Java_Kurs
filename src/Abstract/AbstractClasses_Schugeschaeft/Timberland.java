package AbstractClasses_Schugeschaeft;

public abstract class Timberland extends Shoe {
	
	private String brand = "Timberland";
	private int guaranteeInDays = 50;
	
	public Timberland(String sole, String material, String color, boolean waterproof) {
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
