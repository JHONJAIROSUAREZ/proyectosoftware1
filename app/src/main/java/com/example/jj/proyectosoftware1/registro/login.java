package com.example.jj.proyectosoftware1.registro;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
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

public class login extends AppCompatActivity {
Button login,btnregister;
EditText txtusur,txtpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        login = findViewById(R.id.btnlogin);
        txtusur = findViewById(R.id.txtusu);
        txtpass = findViewById(R.id.txtpass);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final  String codigo_P = txtusur.getText().toString();
                final  String CONTRASENA = txtpass.getText().toString();
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success){
                                String nombre_P = jsonResponse.getString("nombre_P");
                                String apellido = jsonResponse.getString("apellido");
                                String telefono = jsonResponse.getString("telefono");
                                String direccion = jsonResponse.getString("direccion");
                                String cedula = jsonResponse.getString("cedula");

                                Intent intent = new Intent(login.this, usuario.class);


                                intent.putExtra("nombre_P",nombre_P);
                                intent.putExtra("apellido",apellido);
                                intent.putExtra("telefono",telefono);
                                intent.putExtra("direccion",direccion);
                                intent.putExtra("cedula",cedula);
                                intent.putExtra("codigo_P",codigo_P);
                                intent.putExtra("CONTASENA",CONTRASENA);

                                login.this.startActivity(intent);
                                Intent intent1 = new Intent(login.this, MainActivity.class);
                                startActivity(intent1);
                            }else{
                                AlertDialog.Builder builder = new AlertDialog.Builder(login.this);
                                builder.setMessage("ERROR EN EL LOGIN")
                                        .setNegativeButton("RETRY",null)
                                        .create().show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };
                LoginRequest loginRequest = new LoginRequest(codigo_P,CONTRASENA, responseListener);
                RequestQueue queue = Volley.newRequestQueue(login.this);
                queue.add(loginRequest);
            }

        });
        btnregister = findViewById(R.id.btnregister);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, register.class);
                startActivity(intent);
            }
        });

    }
   /* public String enviardatosGET(String usu, String pas){

    }
*/

}
