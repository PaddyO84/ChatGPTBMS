package com.example.bms.ui.task

import androidx.lifecycle.ViewModel
import android.content.Context

class TaskViewModel : ViewModel() {
    fun getTasks(context: Context): List<String> {
        val db = context.openOrCreateDatabase("bms_sample.db", Context.MODE_PRIVATE, null)
        val cursor = db.rawQuery("SELECT description FROM task", null)
        val list = mutableListOf<String>()
        while(cursor.moveToNext()) list.add(cursor.getString(0))
        cursor.close()
        db.close()
        return list
    }
}
