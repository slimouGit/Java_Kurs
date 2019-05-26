package Exception.Array;

/**
 * Created by salim on 06.04.2019.
 */
public class Main {
    public static void main(String[] args) {

        int[] array = new int[5];
        try {
            for (int i = 0; i < 6; i++) {
                array[i] = i;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("Dieser Text wird auch im Fehlerfall ausgegeben");
    }
}
