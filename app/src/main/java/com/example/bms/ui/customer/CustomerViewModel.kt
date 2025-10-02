package com.example.bms.ui.customer

import androidx.lifecycle.ViewModel
import android.content.Context

class CustomerViewModel : ViewModel() {
    fun getCustomers(context: Context): List<String> {
        val db = context.openOrCreateDatabase("bms_sample.db", Context.MODE_PRIVATE, null)
        val cursor = db.rawQuery("SELECT name FROM customer", null)
        val list = mutableListOf<String>()
        while(cursor.moveToNext()) list.add(cursor.getString(0))
        cursor.close()
        db.close()
        return list
    }
}
