package com.example.code.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int resultFromSabirac = 0;
    private static final int resultFromnasumicno = 0;
    TextView prvizbirPrikaz;
    TextView nasumicnoPrikaz;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == resultFromSabirac)
            if (resultCode == RESULT_OK) {
                int zbir = data.getIntExtra("zbir", 0);
                prvizbirPrikaz.setText("Zbir je" + zbir);
                Toast.makeText(this, " STIGAO REZULTAT", Toast.LENGTH_SHORT).show();
            } else {
                super.onActivityResult(requestCode, resultCode, data);

            }

        if (requestCode == resultFromnasumicno)
            if (resultCode == RESULT_OK) {
                int rEndom = data.getIntExtra("nasumican_broj_je", 0);
                nasumicnoPrikaz.setText("Nasumican broj je " + rEndom);
                Toast.makeText(this, " Nasumican stigao", Toast.LENGTH_SHORT).show();
            } else {
                super.onActivityResult(requestCode, resultCode, data);

            }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prvizbirPrikaz = findViewById(R.id.rezultat1);
        nasumicnoPrikaz = findViewById(R.id.rezultat2);


        Button button = findViewById(R.id.prvo_dugme);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SabiracActivity.class);
                MainActivity.this.startActivityForResult(intent, resultFromSabirac);

            }
        });
        Button dumgenasumicno = findViewById(R.id.drugo_dugme);
        dumgenasumicno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Randomactivity.class);
                MainActivity.this.startActivityForResult(intent, resultFromnasumicno);

            }
        });


    }
}