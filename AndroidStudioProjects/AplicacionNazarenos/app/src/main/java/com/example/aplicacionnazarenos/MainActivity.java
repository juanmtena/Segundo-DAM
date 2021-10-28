package com.example.aplicacionnazarenos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinnerMenu = findViewById(R.id.spinnerMenu);
        TextView txtNombreHermandad = findViewById(R.id.txtNombreHermandad);
        TextView txtNumHermanos = findViewById(R.id.txtNumHermanos);
        TextView txtAnoFundacion = findViewById(R.id.txtAnoFundacion);
        ImageView imgFoto = findViewById(R.id.imgFoto);

        spinnerMenu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                position= spinnerMenu.getSelectedItemPosition();

                if(position==0){
                    imgFoto.setImageResource(R.drawable.jesusdelgranpoder);
                    txtNombreHermandad.setText("Gran Poder");
                    txtNumHermanos.setText("150.000");
                    txtAnoFundacion.setText("1900");
                }else if(position==1){
                    imgFoto.setImageResource(R.drawable.macarena);
                    txtNombreHermandad.setText("La Macarena");
                    txtNumHermanos.setText("140.000");
                    txtAnoFundacion.setText("1905");
                }else {
                    imgFoto.setImageResource(R.drawable.montesion);
                    txtNombreHermandad.setText("Montesion");
                    txtNumHermanos.setText("40.000");
                    txtAnoFundacion.setText("1915");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                System.out.println("No has seleccionado ningún item");
            }


        });

    }

}