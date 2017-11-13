package com.example.jj.proyectosoftware1.registro;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Juanda on 6/11/2017.
 */

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL="http://192.168.43.31:8080/Register.php";
    private Map<String,String> params;
    public RegisterRequest(String nombre_P, String apellido, String telefono, String direccion, String cedula, String codigo_P, String CONTRASENA,Response.Listener<String>listener){
        super(Method.POST, REGISTER_REQUEST_URL,listener,null);
        params=new HashMap<>();
        params.put("nombre_P",nombre_P);
        params.put("apellido",apellido);
        params.put("telefono",telefono);
        params.put("direccion",direccion);
        params.put("cedula",cedula);
        params.put("codigo_P",codigo_P);
        params.put("CONTRASENA",CONTRASENA);


    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
