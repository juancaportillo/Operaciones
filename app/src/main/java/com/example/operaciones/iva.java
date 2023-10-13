package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class iva extends AppCompatActivity {

    EditText edtPrecio;
    TextView tvPrecioIva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iva);
        edtPrecio=findViewById(R.id.edtPrecio);
        tvPrecioIva.findViewById(R.id.tvPrecioIva);

    }

    public void calcularIva (View v){
        double precio, iva, precioNuevo;
        precio = Double.valueOf(edtPrecio.getText().toString());
        iva = precio * 0.134;
        precioNuevo = precio + iva;
        tvPrecioIva.setText(String.valueOf(precioNuevo));

    }

    public void Limpiar (View v){
        edtPrecio.setText("");
        tvPrecioIva.setText("");
    }

    public void volver(View v){
        this.finish();
    }
}