package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   Button btnFragA, btnFargB, btnFargC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragA=findViewById(R.id.btnFragA);
        btnFargB=findViewById(R.id.btnFragB);
        btnFargC=findViewById(R.id.btnFragC);

        loadFrag(new BFragment());

        btnFragA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                loadFrag(new AFragment());
            }
        });

        btnFargB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                loadFrag(new BFragment());
            }
        });

        btnFargC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFrag(new CFragment());

            }
        });



    }

    public void loadFrag(Fragment fragment){
        FragmentManager fm =getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.container, fragment);
        ft.commit();
    }
}