package com.example.databaseexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDBHelper dbHelper = new MyDBHelper(this);

        dbHelper.addContact("Chaitu","8757270254");
        dbHelper.addContact("Ramu","7572725470");
        dbHelper.addContact("NAchi","727025784");
        dbHelper.addContact("Tush","757270542");

        ContactModel model = new ContactModel();
        model.id =1;

        dbHelper.updateContacts(model);
    }
}