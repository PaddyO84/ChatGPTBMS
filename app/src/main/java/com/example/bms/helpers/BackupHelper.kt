
package com.example.bms.helpers

import android.content.Context
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

class BackupHelper(val context: Context) {
    fun backupDatabase(destinationDir: File) {
        val dbFile = context.getDatabasePath("bms.db")
        val destFile = File(destinationDir, "bms_backup.db")
        FileInputStream(dbFile).use { input ->
            FileOutputStream(destFile).use { output ->
                input.copyTo(output)
            }
        }
    }
}
