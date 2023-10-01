package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

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



    }


}