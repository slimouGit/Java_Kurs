package AbstractClasses_Schugeschaeft;

public class Main {

	public static void main(String[] args) {
		
		ultraBoost shoe1 = new ultraBoost("Kunststoff", "Leder", "Grün", false);
		shoe1.cleanWithWater();
		shoe1.tieShoes();
		shoe1.tieShoes();

		System.out.println(shoe1.getBrand());
		

	}

}
