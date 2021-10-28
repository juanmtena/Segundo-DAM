package com.example.calculadorasimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VentanaSuma extends AppCompatActivity {

    private static Button btnCalcular;
    private static EditText lblNum1;
    private static EditText lblNum2;
    private static TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_suma);

        btnCalcular = findViewById(R.id.btnCalcular);
        lblNum1 = findViewById(R.id.lblNum1);
        lblNum2 = findViewById(R.id.lblNum1);
        txtResultado = findViewById(R.id.txtResultado);

        btnCalcular.setOnClickListener(view -> {

            txtResultado.setText(suma());

        });



    }

    public static int suma() {

        int num1 = Integer.parseInt(String.valueOf(lblNum1.getText()));
        int num2 = Integer.parseInt(String.valueOf(lblNum2.getText()));

        return num1 + num2;
    }
}