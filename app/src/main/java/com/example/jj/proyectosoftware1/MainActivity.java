package com.example.jj.proyectosoftware1;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.jj.proyectosoftware1.registro.registerclients;
import com.example.jj.proyectosoftware1.registro.usuario;

public class MainActivity extends AppCompatActivity {
Button ingresar,modificar,clientes,btnactivos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ingresar = findViewById(R.id.btningresar);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent ingresar = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(ingresar);
            }
        });
        clientes = findViewById(R.id.btncliente);
        clientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clientes = new Intent(MainActivity.this, registerclients.class);
                startActivity(clientes);
            }
        });
        modificar = findViewById(R.id.btnmodificar);
        modificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent modificar = new Intent(MainActivity.this, ModificarP.class);
                startActivity(modificar);
            }
        });
        btnactivos = findViewById(R.id.btnactivo);
        btnactivos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activo = new Intent(MainActivity.this, usuario.class);
                startActivity(activo);
            }
        });

}

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder mybuild = new AlertDialog.Builder(this);
        mybuild.setMessage("Seguro que quieres salir?");
        mybuild.setTitle("Salir");
        mybuild.setPositiveButton("si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        mybuild.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog dialog = mybuild.create();
        dialog.show();
    }
}
