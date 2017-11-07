package com.example.jj.proyectosoftware1.registro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.jj.proyectosoftware1.MainActivity;
import com.example.jj.proyectosoftware1.R;

public class login extends AppCompatActivity {
Button login;
EditText txtusur,txtpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button)findViewById(R.id.btnlogin);
        txtusur = (EditText)findViewById(R.id.txtusu);
        txtpass = (EditText)findViewById(R.id.txtpass);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(login.this, MainActivity.class);
                startActivity(login);
            }

        });


    }
   /* public String enviardatosGET(String usu, String pas){

    }
*/

}
