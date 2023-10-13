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
    double n1 = Double.parseDouble(valor1);
    double n2= Double.parseDouble(valor2);
    if (rdSuma.isChecked()==true){
    double n3 = n1+n2;
    String res=String.valueOf(n3);
    tvRes.setText(res);
    rdSuma.toggle();
    }
    else if (rdResta.isChecked()==true){
        double n3 = n1-n2;
        String res=String.valueOf(n3);
        tvRes.setText(res);
        rdResta.toggle();
    }
    else if (rdMulti.isChecked()==true){
        double n3 = n1*n2;
        String res=String.valueOf(n3);
        tvRes.setText(res);
        rdMulti.toggle();
    }
    else if (rdDiv.isChecked()==true){
        double n3 = n1*n2;
        String res=String.valueOf(n3);
        tvRes.setText(res);
        rdDiv.toggle();
    }
    else
    {
        Toast.makeText(this, "ERROR: Seleccione una operacion", Toast.LENGTH_LONG).show();
    }


    }
}