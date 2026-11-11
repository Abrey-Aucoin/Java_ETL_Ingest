package com.Abrey.ETL_Ingest.service;

import java.io.IOException;
import org.junit.jupiter.api.Test;

class IngestServiceTests {

    @Test
    void readCsvPrintsSampleRows() throws IOException {
        IngestService service = new IngestService();
        service.readCsv();
    }

}