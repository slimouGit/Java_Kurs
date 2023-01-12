package CSV_Reading;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Optional;

public class ConvertTmpToCsv {
    public static void main(String[] args) throws IOException {
        // Pfad der temporären Datei
        String tempDir = System.getProperty("java.io.tmpdir");
        File tempFile = findLastModifiedFile(tempDir);

        // Lesen Sie den Inhalt der temporären Datei
        byte[] fileContent = Files.readAllBytes(tempFile.toPath());
        String content = new String(fileContent);

        // Erstelle den Pfad der neuen CSV-Datei
        Path newFilePath = Paths.get(tempDir, "temp.csv");

        // Schreiben Sie den Inhalt in die neue CSV-Datei
        FileOutputStream outputStream = new FileOutputStream(newFilePath.toFile());
        outputStream.write(content.getBytes());
        outputStream.close();
        
        deleteFile(newFilePath.toAbsolutePath().toString());
    }

    private static void deleteFile(String newFilePath) {
        File file
                = new File(newFilePath);
        if (file.delete()) {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("Failed to delete the file");
        }
    }

    private static File findLastModifiedFile(String sdir) {
        File dir = new File(sdir);
        if (dir.isDirectory()) {
            Optional<File> opFile = Arrays.stream(dir.listFiles(File::isFile))
                    .max((f1, f2) -> Long.compare(f1.lastModified(), f2.lastModified()));
            if (opFile.isPresent()){
                return opFile.get();
            }
        }

        return null;
    }

}
