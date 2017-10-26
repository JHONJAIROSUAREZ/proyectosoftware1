package com.example.jj.proyectosoftware1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button ingresar,modificar,clientes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ingresar = (Button)findViewById(R.id.btningresar);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent ingresar = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(ingresar);
            }
        });
        clientes = (Button)findViewById(R.id.btncliente);
        clientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clientes = new Intent(MainActivity.this, registerclients.class);
                startActivity(clientes);
            }
        });
        modificar = (Button)findViewById(R.id.btnmodificar);
        modificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent modificar = new Intent(MainActivity.this, ModificarP.class);
                startActivity(modificar);
            }
        });
}
}
