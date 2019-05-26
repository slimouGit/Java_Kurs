package Clone.Clone_Method_tiefeKopie;

/**
 * Created by salim on 13.04.2019.
 */
public class CarEngine implements Cloneable {
    private String engineName;

    public CarEngine(String engineName) {
        this.engineName = engineName;
    }

    @Override
    public CarEngine clone(){
        try {
            return (CarEngine) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Klonen hat nicht geklappt");
            e.printStackTrace();
        }
        return null;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }
}
