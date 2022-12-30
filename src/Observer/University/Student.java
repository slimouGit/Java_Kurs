package Observer.University;

public class Student implements Subscriber{

    private int immatriculationNumber;
    private String name;

    public Student(int immatriculationNumber, String name) {
        this.immatriculationNumber = immatriculationNumber;
        this.name = name;
    }

    @Override
    public void enrole(String facilityName) {
        System.out.println(this.toString() + " is enrolled at " + facilityName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "immatriculationNumber=" + immatriculationNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
