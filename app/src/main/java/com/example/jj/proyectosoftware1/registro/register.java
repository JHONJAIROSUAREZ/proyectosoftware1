package com.example.jj.proyectosoftware1.registro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.example.jj.proyectosoftware1.R;

import org.json.JSONException;
import org.json.JSONObject;

public class register extends AppCompatActivity implements View.OnClickListener {
EditText etnombre,etapellido,etcelular,etdireccion,etcedula,etcodigo,etcontrasena;
Button registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etnombre = findViewById(R.id.editTextnombre);
        etapellido = findViewById(R.id.editTextapellido);
        etcelular = findViewById(R.id.editTextcelular);
       etdireccion = findViewById(R.id.editTextdireccion);
        etcedula = findViewById(R.id.editTextcedula);
        etcodigo = findViewById(R.id.editTextcodigo);
        etcontrasena = findViewById(R.id.editTextcontrasena);
        registrar = findViewById(R.id.btnregistrar);

        registrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final String nombre_P=etnombre.getText().toString();
        final String apellido=etapellido.getText().toString();
        final int celular=Integer.parseInt(etcelular.getText().toString());
        final String direccion=etdireccion.getText().toString();
        final int cedula=Integer.parseInt(etcedula.getText().toString());
        final String codigo_P=etcodigo.getText().toString();
        final String CONTRASENA=etcontrasena.getText().toString();

        Response.Listener<String>respoListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    boolean success =jsonResponse.getBoolean("success");
                    if (success){
                        Intent intent = new Intent(register.this, login.class);
                        AlertDialog.Builder builder = new AlertDialog.Builder(register.this);
                        builder.setMessage("REGISTRO EXITOSO")
                                .create().show();
                        register.this.startActivity(intent);
                    }else{
                        AlertDialog.Builder builder = new AlertDialog.Builder(register.this);
                        builder.setMessage("ERROR EN EL REGISTRO")
                        .setNegativeButton("RETRY",null)
                                .create().show();

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
        RegisterRequest registerRequest = new RegisterRequest(nombre_P,apellido,celular,direccion,cedula,codigo_P,CONTRASENA,respoListener);
        RequestQueue queue = Volley.newRequestQueue(register.this);
        queue.add(registerRequest);
    }
}
