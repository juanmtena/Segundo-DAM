package com.example.calculadorasimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSuma = findViewById(R.id.btnSuma);
        Button btnResta = findViewById(R.id.btnResta);
        Button btnMultiplicar = findViewById(R.id.btnMultiplicar);
        Button btnDividir = findViewById(R.id.btnDividir);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnSuma.setOnClickListener(view -> {

            Intent i = new Intent(this, VentanaSuma.class );
            startActivity(i);
            Toast.makeText(getApplicationContext(), R.string.msjSuma, Toast.LENGTH_LONG).show();

        });

        btnResta.setOnClickListener(view -> {

            Intent i = new Intent(this, VentanaResta.class );
            startActivity(i);

        });

        btnMultiplicar.setOnClickListener(view -> {

            Intent i = new Intent(this, VentanaMultiplicar.class );
            startActivity(i);

        });

        btnDividir.setOnClickListener(view -> {

            Intent i = new Intent(this, VentanaDividir.class );
            startActivity(i);

        });

    }
}