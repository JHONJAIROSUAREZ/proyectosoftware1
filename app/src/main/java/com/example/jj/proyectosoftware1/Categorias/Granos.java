package com.example.jj.proyectosoftware1.Categorias;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.jj.proyectosoftware1.R;

public class Granos extends AppCompatActivity {
Button lent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_granos);
        lent = (Button)findViewById(R.id.btnlenteja);
        lent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }
}
