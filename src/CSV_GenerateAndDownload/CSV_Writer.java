package CSV_GenerateAndDownload;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class CSV_Writer {
    public static void main(String[] args) throws IOException {
        String data = "HeaderColumn1;HeaderColumn2;HeaderColumn3" +
                "\nContentColumn1;ContentColumn2;ContentColumn3" +
                "\nContentColumn1;ContentColumn2;ContentColumn3"+
                "\nContentColumn1;ContentColumn2;ContentColumn3"+
                "\nContentColumn1;ContentColumn2;ContentColumn3"+
                "\nContentColumn1;ContentColumn2;ContentColumn3"+
                "\nContentColumn1;ContentColumn2;ContentColumn3"+
                "\nContentColumn1;ContentColumn2;ContentColumn3";
        PrintWriter pw = new PrintWriter(new FileWriter(new File("out.csv"),true));
        String arr[] = data.split("\\n");
        for(String s:arr){
            pw.println(s);
        }
        pw.close();
    }


}
