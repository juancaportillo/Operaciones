package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class CalculadoraPolacaInversaApp extends AppCompatActivity {
    EditText edtPrimerN, edtSegunN;
    RadioButton rdSuma, rdResta, rdMulti, rdDiv;
    TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_polaca_inversa_app);
        edtPrimerN = (EditText)findViewById(R.id.edtNumero1);
        edtSegunN = (EditText)findViewById(R.id.edtNumero2);
        rdSuma = (RadioButton) findViewById(R.id.rdSumar);
        rdResta=(RadioButton) findViewById(R.id.rdRestar);
        rdMulti=(RadioButton) findViewById(R.id.rdMultiplicar);
        rdDiv=(RadioButton) findViewById(R.id.rdDividir0);
        tvRes=(TextView) findViewById(R.id.tvResultado);
    }

    public void btnCalcular(View v){
    String valor1=edtPrimerN.getText().toString();
    String valor2=edtSegunN.getText().toString();
    int n1 = Integer.parseInt(valor1);
    int n2= Integer.parseInt(valor2);
    if (rdSuma.isChecked()==true){

    }
    else if (rdResta.isChecked()==true){

    }
    else if (rdMulti.isChecked()==true){

    }
    else if (rdDiv.isChecked()==true){

    }
    else
    {
        Toast.makeText(this, "ERROR: Seleccione una operaco[on", Toast.LENGTH_SHORT);
    }


    }
}