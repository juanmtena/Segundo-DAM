package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner listaHermandades = findViewById(R.id.listaHermandades);

        listaHermandades.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                System.out.println("Posicion: " + position);
                System.out.println("Texto: " + item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                System.out.println("No has seleccionado ningun item");
            }
        });



    }
}