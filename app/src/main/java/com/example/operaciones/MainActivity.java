package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNombre = (EditText)findViewById(R.id.edtNombre);
    }
    public void Ingresar (View v){
        Intent lanzar = new Intent(this, Bienvenida.class);
        lanzar.putExtra("clave", edtNombre.getText().toString());
        startActivity(lanzar);
    }

    public void Salir (View v){
        this.finish();
    }
}