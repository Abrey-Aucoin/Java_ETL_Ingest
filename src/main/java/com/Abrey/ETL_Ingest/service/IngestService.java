package com.Abrey.ETL_Ingest.service;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;


public class IngestService {
    //csv file path
    String csvPath = "data/sample.csv";  //csv path
    public void readCsv () throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.builder()
                .setHeader()
                .setSkipHeaderRecord(true)
                .setAllowMissingColumnNames(true)
                .get();
        try (Reader in = Files.newBufferedReader(Path.of(csvPath), StandardCharsets.UTF_8);
             CSVParser parser = format.parse(in)) {
            for (CSVRecord row : parser) {
                System.out.printf("%s | %s | %s | %s | %s | %s | %s | %s | %s | %s | %s | %s |%s | %s | %s | %s | %s | %s |%s | %s | %s | %s%n",
                        row.get("trans_date_trans_time"),
                        row.get("cc_num"),
                        row.get("merchant"),
                        row.get("category"),
                        row.get("amt"),
                        row.get("first"),
                        row.get("last"),
                        row.get("gender"),
                        row.get("street"),
                        row.get("city"),
                        row.get("state"),
                        row.get("zip"),
                        row.get("lat"),
                        row.get("long"),
                        row.get("city_pop"),
                        row.get("job"),
                        row.get("dob"),
                        row.get("trans_num"),
                        row.get("unix_time"),
                        row.get("merch_lat"),
                        row.get("merch_long"),
                        row.get("is_fraud")
                        );
            }
        }
    }

    //section to reject bad data

    //section to log totals, loaded, and rejected counts

    //section to see rejected rows

    //section to sort output
}
