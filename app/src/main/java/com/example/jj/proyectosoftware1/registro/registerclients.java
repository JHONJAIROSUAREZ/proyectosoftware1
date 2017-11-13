package com.example.jj.proyectosoftware1.registro;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.example.jj.proyectosoftware1.MainActivity;
import com.example.jj.proyectosoftware1.R;

import org.json.JSONException;
import org.json.JSONObject;

public class registerclients extends AppCompatActivity implements View.OnClickListener {
    EditText etnombre,etapellido,etcedula,etdireccion,etnombre_T,etcorreo;
    Button btnenviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerclients);
        etnombre = findViewById(R.id.EditTextnombre);
        etapellido = findViewById(R.id.EditTextapellido);
        etcedula = findViewById(R.id.EditTextcedula);
        etdireccion = findViewById(R.id.EditTextdireccion);
        etnombre_T = findViewById(R.id.EditTextnombre_T);
        etcorreo = findViewById(R.id.EditTextcorreo);
        btnenviar = findViewById(R.id.btnenviar);
        btnenviar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        final String nombre=etnombre.getText().toString();
        final String apellido=etapellido.getText().toString();
        final String cedula=etcedula.getText().toString();
        final String direccion=etdireccion.getText().toString();
        final String nombre_T=etnombre_T.getText().toString();
        final String correo=etcorreo.getText().toString();


        Response.Listener<String>respoListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    boolean success =jsonResponse.getBoolean("success");
                    if (success){
                        Intent intent = new Intent(registerclients.this, MainActivity.class);
                        AlertDialog.Builder builder = new AlertDialog.Builder(registerclients.this);
                        builder.setMessage("REGISTRO EXITOSO")
                                .create().show();
                        registerclients.this.startActivity(intent);
                    }else{
                        AlertDialog.Builder builder = new AlertDialog.Builder(registerclients.this);
                        builder.setMessage("ERROR EN EL REGISTRO")
                                .setNegativeButton("RETRY",null)
                                .create().show();

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
        ClienteRequest clienteRequest = new ClienteRequest(nombre,apellido,cedula,direccion,nombre_T,correo,respoListener);
        RequestQueue queue = Volley.newRequestQueue(registerclients.this);
        queue.add(clienteRequest);
    }
}
