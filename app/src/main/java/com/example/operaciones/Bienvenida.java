package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Bienvenida extends AppCompatActivity {
    TextView tvBienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
        tvBienvenida = findViewById(R.id.tvBienvenida);
        String tvBienvenida1 = getIntent().getStringExtra("clave");
        tvBienvenida.setText("Bienvenido  "+tvBienvenida1);
    }

    public void Calcular (View v){
        Intent lanzar = new Intent(this, Bienvenida.class);
        lanzar.putExtra("clave", edtNombre);

    }
}