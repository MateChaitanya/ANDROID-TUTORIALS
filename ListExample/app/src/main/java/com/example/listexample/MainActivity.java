package com.example.listexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Spinner spinner;
    AutoCompleteTextView actxtView;
    ArrayList<String> arrNames = new ArrayList<>();
    ArrayList<String> arrIds = new ArrayList<>();
    ArrayList<String> arrLanguages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner);
        actxtView = findViewById(R.id.actxtView);

        arrNames.add("Chaitu");
        arrNames.add("Nachi");
        arrNames.add("Piyush");
        arrNames.add("Tushar");
        arrNames.add("Yogi");
        arrNames.add("Vinita");
        arrNames.add("Shubhra");
        arrNames.add("Diksha");
        arrNames.add("Jagi");
        arrNames.add("Ramu");
        arrNames.add("Mau");
        arrNames.add("Nachi");
        arrNames.add("Piyush");
        arrNames.add("Tushar");
        arrNames.add("Yogi");
        arrNames.add("Chaitu");
        arrNames.add("Nachi");
        arrNames.add("Piyush");
        arrNames.add("Tushar");
        arrNames.add("Yogi");
        arrNames.add("Vinita");
        arrNames.add("Shubhra");
        arrNames.add("Diksha");
        arrNames.add("Jagi");
        arrNames.add("Ramu");
        arrNames.add("Mau");
        arrNames.add("Nachi");
        arrNames.add("Piyush");
        arrNames.add("Tushar");
        arrNames.add("Yogi");

        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrNames);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Clicked First Item", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Spinner setup
        arrIds.add("Select an ID");
        arrIds.add("Aadhar Card");
        arrIds.add("PAN Card");
        arrIds.add("Voter ID Card");
        arrIds.add("Driving License Card");
        arrIds.add("Ration Card");
        arrIds.add("Xth score  Card");
        arrIds.add("XIIth score Card");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, arrIds);
        spinner.setAdapter(spinnerAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String selectedId = arrIds.get(position);
                Toast.makeText(MainActivity.this, "Selected ID: " + selectedId, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Do nothing here
            }
        });

        // AutocompleteTextview setup
        arrLanguages.add("C");
        arrLanguages.add("C++");
        arrLanguages.add("Java");
        arrLanguages.add("PHP");
        arrLanguages.add("Object C");
        arrLanguages.add("C#");
        arrLanguages.add("CScript");


        ArrayAdapter<String> actvAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, arrLanguages);
        actxtView.setAdapter(actvAdapter);
        actxtView.setThreshold(1);
    }
}
