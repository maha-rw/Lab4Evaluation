package com.example.lab4evaluation;
import android.content.ContentValues;

import android.content.Context;

import android.database.Cursor;

import android.database.sqlite.SQLiteAbortException;

import android.database.sqlite.SQLiteDatabase;

import android.database.sqlite.SQLiteOpenHelper;



import androidx.annotation.Nullable;



import java.util.ArrayList;

import java.util.List;



public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String Customer_TABLE = "Customer_Table";

    public static final String COLUMN_ID = "ID";

    public static final String COLUMN_Customer_Name = "Customer_Name";

    public static final String COLUMN_Customer_Age = "Customer_Age";

    public static final String COLUMN_Active_Customer= "Active_Customer";



    public DataBaseHelper(@Nullable Context context) {

        super(context, "student.db", null, 1);

    }



    // when creating the database

    @Override

    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String createTableStatement = "Create TABLE" + Customer_TABLE + "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_Customer_Name + " TEXT, " + COLUMN_Customer_Age + " INTEGER," +COLUMN_Active_Customer+"BOOLEAN" +")";

        sqLiteDatabase.execSQL(createTableStatement);
    }

    public boolean addOne(customerModel cm){
        SQLiteDatabase db=getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_ID, cm.getID());
        cv.put(COLUMN_Customer_Name, cm.getName());
        cv.put(COLUMN_Customer_Age, cm.getAge());
        cv.put(COLUMN_Active_Customer, cm.isActive());
        db.insert(Customer_TABLE, null, cv);
        long insert = db.insert(Customer_TABLE, null, cv);
        if(insert==-1)
            return false;
        boolean b = true;
        return b;

    }
    // when upgrading

    @Override

    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {



    }




}