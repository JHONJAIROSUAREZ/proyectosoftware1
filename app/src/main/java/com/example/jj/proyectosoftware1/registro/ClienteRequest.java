package com.example.jj.proyectosoftware1.registro;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Juanda on 9/11/2017.
 */

public class ClienteRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL="http://192.168.11.5:8080/Cliente.php";
    private Map<String,String> params;
    public ClienteRequest(String nombre, String apellido, String cedula, String direccion, String nombre_T,String correo,Response.Listener<String>listener){
        super(Method.POST, REGISTER_REQUEST_URL,listener,null);
        params=new HashMap<>();
        params.put("nombre",nombre);
        params.put("apellido",apellido);
        params.put("cedula",cedula);
        params.put("direccion",direccion);
        params.put("nombre_T",nombre_T);
        params.put("correo",correo);



    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
