package com.example.miprimeraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtContenido = findViewById(R.id.txtContenido);
        //Button btnDoble = findViewById(R.id.btnDoble);
        //Button btnTriple = findViewById(R.id.btnTriple);
        TextView lblResultado = findViewById(R.id.lblResultado);

        findViewById(R.id.btnDoble).setOnClickListener(
                v -> {
                        String texto = txtContenido.getText().toString();
                        if (texto.length() == 0) {
                            Toast.makeText(this, R.string.msgFaltaDato, Toast.LENGTH_LONG).show();
                        } else {
                            int resultado = Integer.parseInt(texto);
                            Log.i("Juan", String.valueOf(resultado));
                            lblResultado.setText("" + resultado);
                        }
                }
        );

        findViewById(R.id.btnTriple).setOnClickListener(
                v -> {
                        int numero = Integer.parseInt(txtContenido.getText().toString());
                        int resultado = numero * 3;
                        Log.i("Juan", String.valueOf(resultado));
                        lblResultado.setText("" + resultado);
                }
        );

    }
}