package com.example.applicationpreciofp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.concurrent.atomic.AtomicBoolean;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputEditText entradaTexto = findViewById(R.id.entradaTexto);
        RadioGroup moduloGrupo = findViewById(R.id.moduloGroup);
        RadioGroup turnoGrupo = findViewById(R.id.turnoGroup);
        TextView importe = findViewById(R.id.importe);
        Switch iva =  findViewById(R.id.incluirIva);
        Button calcular = findViewById(R.id.calcular);
        RadioButton DAM = findViewById(R.id.DAM);
        RadioButton DAW = findViewById(R.id.DAW);
        RadioButton Mañana = findViewById(R.id.Mañana);
        RadioButton Tarde = findViewById(R.id.Tarde);

        //Boolean bEntrada = new Boolean(false);
        calcular.setOnClickListener(

                v->{
                    int iSuma=0;
                    if (moduloGrupo.getCheckedRadioButtonId()==DAM.getId()) {
                        iSuma+=1000;
                    } else if (moduloGrupo.getCheckedRadioButtonId()==DAW.getId()){
                        iSuma+=1200;
                    } else iSuma+=750;

                    if (turnoGrupo.getCheckedRadioButtonId()==Mañana.getId()){
                        iSuma+=600;
                    }else if (turnoGrupo.getCheckedRadioButtonId()==Tarde.getId()){
                        iSuma+=400;
                    } else iSuma+=200;

                    if (iva.isChecked()){
                        iSuma=iSuma+(iSuma*21)/100;
                    }
                    if(entradaTexto.getText().length()>=1){
                        importe.setText(""+iSuma+"€");
                    } else {
                        Toast.makeText(this,"Introduce un nombre...",Toast.LENGTH_LONG).show();
                        return;
                    }

                }
        );


    }
}