package com.example.databaseexample;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "ContactsDB";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_CONTACT = "contacts";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_PHONE_NO = "phone_no";

    public MyDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // CREATE TABLE contacts (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, phone_no TEXT);
        db.execSQL("CREATE TABLE " + TABLE_CONTACT +
                "(" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                KEY_NAME + " TEXT, " + KEY_PHONE_NO + " TEXT" + ")");

        // Note: You don't need to create another writable database here; the `onCreate` method is
        // called when the database is created, and you can perform necessary setup there.
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACT);

        onCreate(db);
    }

    public void addContact(String name, String phone_no) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, name);
        values.put(KEY_PHONE_NO, phone_no);

        db.insert(TABLE_CONTACT, null, values);
    }

    public void updateContacts(ContactModel contactModel ){
        SQLiteDatabase database = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(KEY_PHONE_NO, "1234567890");

        database.update(TABLE_CONTACT, cv , KEY_ID + "= "+contactModel.id, null );

    }

    public void DeleteContact(int id){
        SQLiteDatabase database = this.getWritableDatabase();

        database.delete(TABLE_CONTACT,KEY_ID+ "=? ", new String[]{String.valueOf(id)});
    }
}
