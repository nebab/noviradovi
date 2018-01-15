package com.example.code.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;



public class Randomactivity extends AppCompatActivity {

    EditText nasumicno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dugmenasumicno);

        nasumicno = findViewById(R.id.rezultat2);

        Button dumgenasumicno = findViewById(R.id.dugmenasumicno);
        dumgenasumicno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nasumicnobiram();
            }
        });
    }

    private void nasumicnobiram() {


        Random rnd = new Random();
        Toast.makeText(this, "Zbir je", Toast.LENGTH_SHORT).show();
        Intent rEn = new Intent();
        rEn.putExtra("nasumican_broj_je", rnd.nextInt(101));
        setResult(RESULT_OK, rEn);
        finish();

    }


}
