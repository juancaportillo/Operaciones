package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CalculadoraPolacaInversaApp extends AppCompatActivity {
    EditText edtPrimerN, edtSegunN;
    RadioButton rdSuma, rdResta, rdMulti, rdDiv;

    RadioGroup rdG;
    TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_polaca_inversa_app);
        edtPrimerN =findViewById(R.id.edtNumero1);
        edtSegunN = findViewById(R.id.edtNumero2);
        rdSuma = findViewById(R.id.rdSumar);
        rdResta=findViewById(R.id.rdRestar);
        rdMulti=findViewById(R.id.rdMultiplicar);
        rdDiv= findViewById(R.id.rdDividir0);
        tvRes=findViewById(R.id.tvResultado);
        rdG=findViewById(R.id.rdGroup);
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
    rdSuma.setChecked(false);
    }
    else if (rdResta.isChecked()==true){
        double n3 = n1-n2;
        String res=String.valueOf(n3);
        tvRes.setText(res);
        rdResta.setChecked(false);
    }
    else if (rdMulti.isChecked()==true){
        double n3 = n1*n2;
        String res=String.valueOf(n3);
        tvRes.setText(res);
        rdMulti.setChecked(false);
    }
    else if (rdDiv.isChecked()==true){
        double n3 = n1/n2;
        String res=String.valueOf(n3);
        tvRes.setText(res);
        rdDiv.setChecked(false);
    }
    else
    {
        Toast.makeText(this, "ERROR: Seleccione una operacion", Toast.LENGTH_LONG).show();
    }
    }

    public void btLimp(View v){
    rdG.check(0);
    edtPrimerN.setText("");
    edtSegunN.setText("");


    }

    public void btnVol(View v){
        this.finish();
    }
}