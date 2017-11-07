package com.example.jj.proyectosoftware1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity implements View.OnClickListener {
EditText nombre,apellido,celular,direccion,cedula,codigo,contrasena;
Button registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nombre = (EditText)findViewById(R.id.etnombre);
        apellido = (EditText)findViewById(R.id.etapellido);
        celular = (EditText)findViewById(R.id.etcelular);
        direccion = (EditText)findViewById(R.id.etdireccion);
        cedula = (EditText)findViewById(R.id.etcedula);
        codigo = (EditText)findViewById(R.id.etcodigo);
        contrasena = (EditText)findViewById(R.id.etcontrasena);
        registrar = (Button)findViewById(R.id.btnregistrar);

        registrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
