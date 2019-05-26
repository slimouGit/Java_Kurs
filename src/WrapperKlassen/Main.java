package WrapperKlassen;

/**
 * Created by salim on 23.03.2019.
 */
public class Main {
    //byte => Byte
    //short => Short
    //long => Long
    //int => Integer
    //double => Double
    //float => Float
    //boolean => Boolean
    //char => Character

    public static void main(String[] args){

        int i = 10;

        //Integer => immer final
        Integer i1 = Integer.valueOf(i);    //valueOf()
        Integer i2 = new Integer(30); //Konstruktor
        Integer i3 = 42;                    //Boxing => (valueOf)
        int i4 = i3;                        //Unboxing

        i1 = Integer.valueOf(25);


        System.out.println(i1);
        System.out.println(i1.intValue());
        System.out.println(i1.toString());
        System.out.println(i1.byteValue());

    }
}
