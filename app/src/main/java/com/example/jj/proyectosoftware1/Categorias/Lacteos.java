package com.example.jj.proyectosoftware1.Categorias;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jj.proyectosoftware1.R;

public class Lacteos extends AppCompatActivity {
Button yogurt,btn3,btn4,btn5,btn6,btn7,btn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lacteos);
        Button yogurt = (Button)findViewById(R.id.btncerealvaso);
        yogurt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Lacteos.this);
                View mview = getLayoutInflater().inflate(R.layout.informacion_producto,null);
                TextView id = findViewById(R.id.tvid);
                TextView producto = findViewById(R.id.tvproducto);
                TextView cdisponible = findViewById(R.id.tvcantidadD);
                TextView precio = findViewById(R.id.tvprecio);
                TextView cpedido = findViewById(R.id.tvcantidadP);

                TextView idview = findViewById(R.id.tvidn);
                TextView productoview = findViewById(R.id.tvproducton);
                TextView cdisponibleview = findViewById(R.id.tvcantidadDn);
                TextView precioview = findViewById(R.id.tvprecion);
                EditText cpedidoview = findViewById(R.id.etcantidadPn);

                Button cancelar = findViewById(R.id.btncancelar);
                Button agregar = findViewById(R.id.btnagregar);



                dialogBuilder.setView(mview);
                AlertDialog dialog = dialogBuilder.create();
                dialog.show();

            }
        });
        Button btn3 = (Button)findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Lacteos.this);
                View mview = getLayoutInflater().inflate(R.layout.informacion_producto,null);
                TextView id = findViewById(R.id.tvid);
                TextView producto = findViewById(R.id.tvproducto);
                TextView cdisponible = findViewById(R.id.tvcantidadD);
                TextView precio = findViewById(R.id.tvprecio);
                TextView cpedido = findViewById(R.id.tvcantidadP);

                TextView idview = findViewById(R.id.tvidn);
                TextView productoview = findViewById(R.id.tvproducton);
                TextView cdisponibleview = findViewById(R.id.tvcantidadDn);
                TextView precioview = findViewById(R.id.tvprecion);
                EditText cpedidoview = findViewById(R.id.etcantidadPn);

                Button cancelar = findViewById(R.id.btncancelar);
                Button agregar = findViewById(R.id.btnagregar);



                dialogBuilder.setView(mview);
                AlertDialog dialog = dialogBuilder.create();
                dialog.show();

            }
        });
        Button btn4 = (Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Lacteos.this);
                View mview = getLayoutInflater().inflate(R.layout.informacion_producto,null);
                TextView id = findViewById(R.id.tvid);
                TextView producto = findViewById(R.id.tvproducto);
                TextView cdisponible = findViewById(R.id.tvcantidadD);
                TextView precio = findViewById(R.id.tvprecio);
                TextView cpedido = findViewById(R.id.tvcantidadP);

                TextView idview = findViewById(R.id.tvidn);
                TextView productoview = findViewById(R.id.tvproducton);
                TextView cdisponibleview = findViewById(R.id.tvcantidadDn);
                TextView precioview = findViewById(R.id.tvprecion);
                EditText cpedidoview = findViewById(R.id.etcantidadPn);

                Button cancelar = findViewById(R.id.btncancelar);
                Button agregar = findViewById(R.id.btnagregar);



                dialogBuilder.setView(mview);
                AlertDialog dialog = dialogBuilder.create();
                dialog.show();

            }
        });
        Button btn5 = (Button)findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Lacteos.this);
                View mview = getLayoutInflater().inflate(R.layout.informacion_producto,null);
                TextView id = findViewById(R.id.tvid);
                TextView producto = findViewById(R.id.tvproducto);
                TextView cdisponible = findViewById(R.id.tvcantidadD);
                TextView precio = findViewById(R.id.tvprecio);
                TextView cpedido = findViewById(R.id.tvcantidadP);

                TextView idview = findViewById(R.id.tvidn);
                TextView productoview = findViewById(R.id.tvproducton);
                TextView cdisponibleview = findViewById(R.id.tvcantidadDn);
                TextView precioview = findViewById(R.id.tvprecion);
                EditText cpedidoview = findViewById(R.id.etcantidadPn);

                Button cancelar = findViewById(R.id.btncancelar);
                Button agregar = findViewById(R.id.btnagregar);



                dialogBuilder.setView(mview);
                AlertDialog dialog = dialogBuilder.create();
                dialog.show();

            }
        });
        Button btn6 = (Button)findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Lacteos.this);
                View mview = getLayoutInflater().inflate(R.layout.informacion_producto,null);
                TextView id = findViewById(R.id.tvid);
                TextView producto = findViewById(R.id.tvproducto);
                TextView cdisponible = findViewById(R.id.tvcantidadD);
                TextView precio = findViewById(R.id.tvprecio);
                TextView cpedido = findViewById(R.id.tvcantidadP);

                TextView idview = findViewById(R.id.tvidn);
                TextView productoview = findViewById(R.id.tvproducton);
                TextView cdisponibleview = findViewById(R.id.tvcantidadDn);
                TextView precioview = findViewById(R.id.tvprecion);
                EditText cpedidoview = findViewById(R.id.etcantidadPn);

                Button cancelar = findViewById(R.id.btncancelar);
                Button agregar = findViewById(R.id.btnagregar);



                dialogBuilder.setView(mview);
                AlertDialog dialog = dialogBuilder.create();
                dialog.show();

            }
        });
        Button btn7 = (Button)findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Lacteos.this);
                View mview = getLayoutInflater().inflate(R.layout.informacion_producto,null);
                TextView id = findViewById(R.id.tvid);
                TextView producto = findViewById(R.id.tvproducto);
                TextView cdisponible = findViewById(R.id.tvcantidadD);
                TextView precio = findViewById(R.id.tvprecio);
                TextView cpedido = findViewById(R.id.tvcantidadP);

                TextView idview = findViewById(R.id.tvidn);
                TextView productoview = findViewById(R.id.tvproducton);
                TextView cdisponibleview = findViewById(R.id.tvcantidadDn);
                TextView precioview = findViewById(R.id.tvprecion);
                EditText cpedidoview = findViewById(R.id.etcantidadPn);

                Button cancelar = findViewById(R.id.btncancelar);
                Button agregar = findViewById(R.id.btnagregar);



                dialogBuilder.setView(mview);
                AlertDialog dialog = dialogBuilder.create();
                dialog.show();

            }
        });
        Button btn8 = (Button)findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Lacteos.this);
                View mview = getLayoutInflater().inflate(R.layout.informacion_producto,null);
                TextView id = findViewById(R.id.tvid);
                TextView producto = findViewById(R.id.tvproducto);
                TextView cdisponible = findViewById(R.id.tvcantidadD);
                TextView precio = findViewById(R.id.tvprecio);
                TextView cpedido = findViewById(R.id.tvcantidadP);

                TextView idview = findViewById(R.id.tvidn);
                TextView productoview = findViewById(R.id.tvproducton);
                TextView cdisponibleview = findViewById(R.id.tvcantidadDn);
                TextView precioview = findViewById(R.id.tvprecion);
                EditText cpedidoview = findViewById(R.id.etcantidadPn);

                Button cancelar = findViewById(R.id.btncancelar);
                Button agregar = findViewById(R.id.btnagregar);



                dialogBuilder.setView(mview);
                AlertDialog dialog = dialogBuilder.create();
                dialog.show();

            }
        });
        Button btn13 = (Button)findViewById(R.id.button13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Lacteos.this);
                View mview = getLayoutInflater().inflate(R.layout.informacion_producto,null);
                TextView id = findViewById(R.id.tvid);
                TextView producto = findViewById(R.id.tvproducto);
                TextView cdisponible = findViewById(R.id.tvcantidadD);
                TextView precio = findViewById(R.id.tvprecio);
                TextView cpedido = findViewById(R.id.tvcantidadP);

                TextView idview = findViewById(R.id.tvidn);
                TextView productoview = findViewById(R.id.tvproducton);
                TextView cdisponibleview = findViewById(R.id.tvcantidadDn);
                TextView precioview = findViewById(R.id.tvprecion);
                EditText cpedidoview = findViewById(R.id.etcantidadPn);

                Button cancelar = findViewById(R.id.btncancelar);
                Button agregar = findViewById(R.id.btnagregar);



                dialogBuilder.setView(mview);
                AlertDialog dialog = dialogBuilder.create();
                dialog.show();

            }
        });
    }
}
