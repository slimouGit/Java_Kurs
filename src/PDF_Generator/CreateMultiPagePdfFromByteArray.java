package PDF_Generator;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateMultiPagePdfFromByteArray {

    public static void main(String[] args) throws IOException {

        try {

            // tested with character data and binary data

            // file to bytes[]
            byte[] bytes = Files.readAllBytes(Paths.get("C:\\Users\\oussa\\test.txt"));

            // save byte[] to a file


            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

