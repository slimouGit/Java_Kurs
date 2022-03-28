package Equal;

public class Moof {
	
	private int moofValue;

	public Moof(int moofValue) {
		super();
		this.moofValue = moofValue;
	}

	public int getMoofValue() {
		return moofValue;
	}

	public void setMoofValue(int moofValue) {
		this.moofValue = moofValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + moofValue;
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if((o instanceof Moof) && (((Moof)o).getMoofValue() == this.moofValue)) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
