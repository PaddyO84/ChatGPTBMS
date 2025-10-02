
package com.example.bms.helpers

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) :
    SQLiteOpenHelper(context, "bms.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE customer(id INTEGER PRIMARY KEY, name TEXT)")
        db?.execSQL("CREATE TABLE job(id INTEGER PRIMARY KEY, title TEXT)")
        db?.execSQL("INSERT INTO customer(name) VALUES('Sample Customer')")
        db?.execSQL("INSERT INTO job(title) VALUES('Sample Job')")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {}
}
