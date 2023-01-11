package CSV_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CsvToAvro {
    public static void main(String[] args) throws IOException {
        // CSV-Datei einlesen
        File csvFile = new File("example.csv");
        CSVParser parser = CSVParser.parse(csvFile, StandardCharsets.UTF_8, CSVFormat.DEFAULT);

        // Avro-Schema erstellen
        Schema schema = new Schema.Parser().parse(new File("example.avsc"));

        // Avro-Datensatz erstellen
        GenericRecord avroRecord = new GenericData.Record(schema);

        // Avro-Datei erstellen
        File avroFile = new File("example.avro");
        DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<>(schema);
        DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<>(datumWriter);
        dataFileWriter.create(schema, avroFile);

        // CSV-Datensätze in Avro-Datensätze umwandeln
        for (CSVRecord record : parser) {
            for (Schema.Field field : schema.getFields()) {
                String fieldName = field.name();
                String fieldValue = record.get(fieldName);
                avroRecord.put(fieldName, fieldValue);
            }
            dataFileWriter.append(avroRecord);
        }

        // Avro-Datei schließen
        dataFileWriter.close();
        parser.close();
    }
}

