package com.example.code.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SabiracActivity extends AppCompatActivity {

    EditText prvi;
    EditText drugi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabirac);

        prvi = findViewById(R.id.prvi_sabirak);
        drugi = findViewById(R.id.drugi_sabirak);
        Button buton = findViewById(R.id.Saberi);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saberi();
            }
        });


    }

    private void saberi() {

        String prvisabirak = prvi.getText().toString();
        String drugisabirak = drugi.getText().toString();
        if (TextUtils.isEmpty(prvisabirak)) {
            Toast.makeText(this, "unesite prvi broj", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(prvisabirak)) {
            Toast.makeText(this, "unesite drugi broj", Toast.LENGTH_LONG).show();
            return;

        }
        int prviint;
        try {
            prviint = Integer.parseInt(prvisabirak);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "los format prvog broja", Toast.LENGTH_SHORT).show();
            return;
        }

        int drugiint;
        try {
            drugiint = Integer.parseInt(drugisabirak);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "los format drugog broja", Toast.LENGTH_SHORT).show();
            return;
        }


        int zbir = prviint + drugiint;
        Toast.makeText(this, "Zbir je", Toast.LENGTH_SHORT).show();

        Intent result = new Intent();
        result.putExtra("zbir", zbir);

        setResult(RESULT_OK, result);
        finish();


    }
}


