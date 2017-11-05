package com.example.jj.proyectosoftware1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.jj.proyectosoftware1.Categorias.Granos;
import com.example.jj.proyectosoftware1.Categorias.Lacteos;

public class Main2Activity extends AppCompatActivity {
Button btngranos, btnlacteos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        btngranos = (Button)findViewById(R.id.btngranos);
        btngranos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Granos.class);
                startActivity(intent);
            }
        });

            btnlacteos= (Button)findViewById(R.id.btnlacteos);
            btnlacteos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Main2Activity.this,Lacteos.class);
                    startActivity(intent);
            }
        });


    }
}
