package com.example.jj.proyectosoftware1.registro;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.jj.proyectosoftware1.R;

public class usuario extends AppCompatActivity {
TextView TextViewnombre,TextViewapellido,TextViewtelefono,TextViewdireccion,TextViewcedula;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            TextViewnombre = findViewById(R.id.tvnombre);
        TextViewapellido = findViewById(R.id.tvapellido);
        TextViewtelefono = findViewById(R.id.tvtelefono);
        TextViewdireccion = findViewById(R.id.tvdireccion);
        TextViewcedula = findViewById(R.id.tvcedula);

        Intent intent = getIntent();
        String nombre_P =intent.getStringExtra("nombre_P");
        String apellido = intent.getStringExtra("apellido");
        String  telefono= intent.getStringExtra("telefono");
        String direccion = intent.getStringExtra("direccion");
        String  cedula = intent.getStringExtra("cedula");

        TextViewnombre.setText(nombre_P);
        TextViewapellido.setText(apellido);
        TextViewtelefono.setText(telefono);
        TextViewdireccion.setText(direccion);
        TextViewcedula.setText(cedula);
    }
}
