package CSV_Reading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) {

        String csvFile = "E:\\git_repo\\JAVA\\JavaKurs\\src\\CSV_Reading\\username.csv";
        String line = "";
        String csvSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String[] header = br.readLine().split(csvSplitBy);

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(csvSplitBy);

                for (int i = 0; i < data.length; i++) {
                    // validate each cell separately and passing header and column index
                    if (validateCell(header[i], data[i], i)) {
                        System.out.println("valid: " + header[i] + " : " + data[i]);
                    } else {
                        System.out.println("invalid: " + header[i] + " : " + data[i]);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean validateCell(String header, String cell, int columnIndex) {
        // you can implement your own cell validation logic here
        // for example, check if the cell is empty or only contains letters
        if(header.equals("First name") && cell.equals("Rachel")){
            return false;
        }
        return true;
    }
}





