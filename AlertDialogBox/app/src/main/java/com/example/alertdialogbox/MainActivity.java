package com.example.alertdialogbox;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Display a terms and conditions AlertDialog
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Terms & Condition")
                .setIcon(R.drawable.ic_baseline_info_24)
                .setMessage("Have You Read All the Terms and Condition")
                .setPositiveButton("Yes, I've Read", (dialogInterface, i) -> Toast.makeText(MainActivity.this, "Yes", Toast.LENGTH_SHORT).show())
                .create();

        alertDialog.show();

        // Display a confirmation dialog for item deletion
        AlertDialog.Builder deldialog = new AlertDialog.Builder(MainActivity.this);

        deldialog.setTitle("Delete")
                .setIcon(R.drawable.baseline_delete_24)
                .setMessage("Are you sure want to delete ?")
                .setPositiveButton("Yes", (dialogInterface, i) -> Toast.makeText(MainActivity.this, "Item Deleted", Toast.LENGTH_SHORT).show())
                .setNegativeButton("No", (dialogInterface, i) -> Toast.makeText(MainActivity.this, "Item not Deleted", Toast.LENGTH_SHORT).show());

        AlertDialog delDialog = deldialog.create();
        delDialog.show();
    }

    @Override
    public void onBackPressed() {
        // Display an exit confirmation dialog
        AlertDialog.Builder exitDialog = new AlertDialog.Builder(this);

        exitDialog.setTitle("Exit")
                .setMessage("Are you sure you want to exit?")
                .setIcon(R.drawable.baseline_exit_to_app_24)
                .setPositiveButton("Yes", (dialogInterface, i) -> {
                    Toast.makeText(MainActivity.this, "Welcome Back", Toast.LENGTH_SHORT).show();
                    finish(); // Close the app
                })
                .setNegativeButton("No", (dialogInterface, i) -> dialogInterface.dismiss());

        AlertDialog exitAlertDialog = exitDialog.create();
        exitAlertDialog.show();
    }
}
