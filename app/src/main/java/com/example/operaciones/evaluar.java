package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class evaluar extends AppCompatActivity {
    EditText edtNum;
    TextView tvNum,tvplus,tvfor,tvMinus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluar);
        edtNum= findViewById(R.id.edtNum);
        tvNum= findViewById(R.id.tvVal);
        tvplus= findViewById(R.id.tvPlus77);
        tvfor= findViewById(R.id.tvFor2);
        tvMinus= findViewById(R.id.tvMinus3);
    }
    public void btnres(View v){
        String entrada=edtNum.getText().toString();
        double intEntrada = Double.parseDouble(entrada);
        double suma = intEntrada+77;
        double resta = intEntrada-3;
        double multi=intEntrada*2;
        String res1=String.valueOf(suma);
        String res2=String.valueOf(resta);
        String res3=String.valueOf(multi);
        tvplus.setText(entrada+"+77="+res1);
        tvMinus.setText(entrada+"-3="+res2);
        tvfor.setText(entrada+"*2="+res3);
        edtNum.setText("");
    }



    public void volver (View v){
        this.finish();
    }
}