package com.example.customtoastmaking;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup; // Import ViewGroup
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = findViewById(R.id.btnToast);

        btnToast.setOnClickListener(new View.OnClickListener() { // Corrected the spelling and syntax
            @Override
            public void onClick(View v) { // Corrected the parameter name
                Toast toast = new Toast(getApplicationContext());

                View view = getLayoutInflater().inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.viewContainer));
                toast.setView(view);

                TextView txtMsg = view.findViewById(R.id.txtMsg);
                txtMsg.setText("Message sent Successfully"); // Corrected the syntax

                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
