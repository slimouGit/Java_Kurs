package Equal.Equals_Hashmap_Danceschool;


import Equal.Equals.Student;

/**
 * Created by salim on 05.04.2019.
 */
public class Dancer {
    private String name;

    public Dancer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEquals = true;
        if(this == obj){
            isEquals = true;
        }
        if(obj == null){
            isEquals = false;
        }
        if(!(obj instanceof Student)){
            isEquals = false;
        }
        Dancer tmpDancer = (Dancer) obj;

        if(!(this.name.equals(tmpDancer.name))){
            isEquals = false;
        }
        if(!(this.name.equals(tmpDancer.name))){
            isEquals = true;
        }

        return isEquals;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
