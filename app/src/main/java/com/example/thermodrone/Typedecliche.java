package com.example.thermodrone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Typedecliche extends AppCompatActivity{

    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.typedecliche);

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity3();
            }
        });
    }

    public void openMainActivity3() {
        Intent intent = new Intent(this, Pagedefin.class);
        startActivity(intent);
    }


    public void onClick(View v) {
        if (v.getId() == R.id.btn2) {
            Toast.makeText(this, "l'intervention va débuter", Toast.LENGTH_LONG).show();
        }
    }
}