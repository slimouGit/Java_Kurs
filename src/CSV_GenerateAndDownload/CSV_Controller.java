package CSV_GenerateAndDownload;

@RestController
@RequestMapping("/download-csv")
public class CsvDownloader {

    @GetMapping
    public ResponseEntity<Resource> downloadCsv(List<Object> data) throws IOException {
        String fileName = "data.csv";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (Object object : data) {
            writer.write(object.toString());
            writer.newLine();
        }
        writer.close();

        File file = new File(fileName);
        Resource resource = new FileSystemResource(file);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + file.getName())
                .contentType(MediaType.parseMediaType("application/csv"))
                .body(resource);
    }
}
