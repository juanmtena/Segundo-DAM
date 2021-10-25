package com.example.componentes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton btcAccion = findViewById(R.id.btnAction);
        Button btnUno = findViewById(R.id.btn1);
        Button btnDos = findViewById(R.id.btn2);
        Button btnTres = findViewById(R.id.btn3);
        Button btnCuatro = findViewById(R.id.btn4);
        Button btnCinco = findViewById(R.id.btn5);
        Button btnSeis = findViewById(R.id.btn6);

        findViewById(R.id.btnAction).setOnClickListener(
                v -> {
                    Toast.makeText(this, "Ponga su huella", Toast.LENGTH_LONG).show();
                    findViewById(R.id.btnAction).setVisibility(View.INVISIBLE);
                }
        );

        findViewById(R.id.btn1).setOnClickListener(
                v -> {
                    findViewById(R.id.btn1).setVisibility(View.INVISIBLE);
                    if(btnDos.getVisibility() == View.INVISIBLE
                            && btnTres.getVisibility() == View.INVISIBLE
                            && btnCuatro.getVisibility() == View.INVISIBLE
                            && btnCinco.getVisibility() == View.INVISIBLE
                            && btnSeis.getVisibility() == View.INVISIBLE) {
                        btcAccion.setVisibility(View.VISIBLE);
                    }
                }
        );

        findViewById(R.id.btn2).setOnClickListener(
                v -> {
                    findViewById(R.id.btn2).setVisibility(View.INVISIBLE);
                    if(btnUno.getVisibility() == View.INVISIBLE
                            && btnTres.getVisibility() == View.INVISIBLE
                            && btnCuatro.getVisibility() == View.INVISIBLE
                            && btnCinco.getVisibility() == View.INVISIBLE
                            && btnSeis.getVisibility() == View.INVISIBLE) {
                        btcAccion.setVisibility(View.VISIBLE);
                    }
                }
        );

        findViewById(R.id.btn3).setOnClickListener(
                v -> {
                    findViewById(R.id.btn3).setVisibility(View.INVISIBLE);
                    if(btnUno.getVisibility() == View.INVISIBLE
                            && btnDos.getVisibility() == View.INVISIBLE
                            && btnCuatro.getVisibility() == View.INVISIBLE
                            && btnCinco.getVisibility() == View.INVISIBLE
                            && btnSeis.getVisibility() == View.INVISIBLE) {
                        btcAccion.setVisibility(View.VISIBLE);
                    }
                }
        );

        findViewById(R.id.btn4).setOnClickListener(
                v -> {
                    findViewById(R.id.btn4).setVisibility(View.INVISIBLE);
                    if(btnUno.getVisibility() == View.INVISIBLE
                            && btnDos.getVisibility() == View.INVISIBLE
                            && btnTres.getVisibility() == View.INVISIBLE
                            && btnCinco.getVisibility() == View.INVISIBLE
                            && btnSeis.getVisibility() == View.INVISIBLE) {
                        btcAccion.setVisibility(View.VISIBLE);
                    }
                }
        );

        findViewById(R.id.btn5).setOnClickListener(
                v -> {
                    findViewById(R.id.btn5).setVisibility(View.INVISIBLE);
                    if(btnUno.getVisibility() == View.INVISIBLE
                            && btnDos.getVisibility() == View.INVISIBLE
                            && btnTres.getVisibility() == View.INVISIBLE
                            && btnCuatro.getVisibility() == View.INVISIBLE
                            && btnSeis.getVisibility() == View.INVISIBLE) {
                        btcAccion.setVisibility(View.VISIBLE);
                    }
                }
        );

        findViewById(R.id.btn6).setOnClickListener(
                v -> {
                    findViewById(R.id.btn6).setVisibility(View.INVISIBLE);
                    if(btnUno.getVisibility() == View.INVISIBLE
                            && btnDos.getVisibility() == View.INVISIBLE
                            && btnTres.getVisibility() == View.INVISIBLE
                            && btnCuatro.getVisibility() == View.INVISIBLE
                            && btnCinco.getVisibility() == View.INVISIBLE) {
                        btcAccion.setVisibility(View.VISIBLE);
                    }
                }
        );

        findViewById(R.id.btnAction).setOnClickListener(
                v -> {
                    Toast.makeText(this, "Ponga su huella", Toast.LENGTH_LONG).show();
                    findViewById(R.id.btnAction).setVisibility(View.INVISIBLE);

                    findViewById(R.id.btn1).setVisibility(View.VISIBLE);
                    findViewById(R.id.btn2).setVisibility(View.VISIBLE);
                    findViewById(R.id.btn3).setVisibility(View.VISIBLE);
                    findViewById(R.id.btn4).setVisibility(View.VISIBLE);
                    findViewById(R.id.btn5).setVisibility(View.VISIBLE);
                    findViewById(R.id.btn6).setVisibility(View.VISIBLE);
                }
        );

    }
}