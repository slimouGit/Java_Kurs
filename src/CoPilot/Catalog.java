package CoPilot;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;

public class Catalog {
        public static void main(String[] args) {
            Path dir = Paths.get("E:\\musik\\technisch-und");
             AtomicInteger counter = new AtomicInteger(1);
        
            try {
                
                BufferedWriter writer = new BufferedWriter(new FileWriter(dir+"\\music-catalog.txt"));
                Files.walk(dir)
                    .filter(Files::isRegularFile)
                    .forEach(file -> {
                        try {
                            writer.write(counter.getAndIncrement() + " "  + file.toString());
                            writer.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
