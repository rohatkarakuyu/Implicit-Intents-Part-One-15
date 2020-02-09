package com.soogreyhounds.soogreyhoundsmobile.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SooGreyhoundsDBHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "SooGreyhounds.db";
    public SooGreyhoundsDBHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table " + SooGreyhoundsDBSchema.PhotoTable.NAME + "(" +
                " _id integer primary key autoincrement, " +
                SooGreyhoundsDBSchema.PhotoTable.Cols.UUID + ", " +
                SooGreyhoundsDBSchema.PhotoTable.Cols.TITLE + ", " +
                SooGreyhoundsDBSchema.PhotoTable.Cols.URL + ", " +
                SooGreyhoundsDBSchema.PhotoTable.Cols.NOTE +", " +
                SooGreyhoundsDBSchema.PhotoTable.Cols.PERSON +
                ")"
        );
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}