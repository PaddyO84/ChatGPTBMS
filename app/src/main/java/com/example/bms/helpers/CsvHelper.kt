
package com.example.bms.helpers

import android.content.Context
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVPrinter
import java.io.File
import java.io.FileWriter

class CsvHelper(val context: Context) {
    fun generateSampleCsv(filename: String) {
        val file = File(context.filesDir, filename)
        FileWriter(file).use { writer ->
            val csvPrinter = CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("Name","Value"))
            csvPrinter.printRecord("Sample", "123")
            csvPrinter.flush()
        }
    }
}
