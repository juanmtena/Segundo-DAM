package com.example.calculadorasimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VentanaDividir extends AppCompatActivity {

    private static Button btnCalcular;
    private static EditText lblNum1;
    private static EditText lblNum2;
    private static TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_dividir);

        btnCalcular = findViewById(R.id.btnCalcular);
        lblNum1 = findViewById(R.id.lblNum1);
        lblNum2 = findViewById(R.id.lblNum1);
        txtResultado = findViewById(R.id.txtResultado);

        btnCalcular.setOnClickListener(view -> {

            txtResultado.setText((int) dividir());

        });

    }

    public static float dividir() {

        float num7 = Float.parseFloat(String.valueOf(lblNum1.getText()));
        float num8 = Float.parseFloat(String.valueOf(lblNum2.getText()));

        return num7 / num8;
    }
}