
package com.example.bms.helpers

import android.content.Context
import com.itextpdf.kernel.pdf.PdfWriter
import com.itextpdf.layout.Document
import com.itextpdf.layout.element.Paragraph
import java.io.File

class PdfHelper(val context: Context) {
    fun generateInvoice(filename: String) {
        val file = File(context.filesDir, filename)
        val writer = PdfWriter(file)
        val pdf = com.itextpdf.kernel.pdf.PdfDocument(writer)
        val document = Document(pdf)
        document.add(Paragraph("Invoice Sample"))
        document.close()
    }
}
