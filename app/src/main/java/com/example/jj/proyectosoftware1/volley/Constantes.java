package com.example.jj.proyectosoftware1.volley;

/**
 * Created by Juanda on 29/11/2017.
 */

public class Constantes {

    /**
     * Transición Home -> Detalle
     */
    public static final int CODIGO_DETALLE = 100;

    /**
     * Transición Detalle -> Actualización
     */
    public static final int CODIGO_ACTUALIZACION = 101;

    /**
     * Puerto que utilizas para la conexión.
     * Dejalo en blanco si no has configurado esta carácteristica.
     */
    private static final String PUERTO_HOST = "80";

    /**
     * Dirección IP de genymotion o AVD
     */
    private static final String IP = "http://192.168.19.2:";
    /**
     * URLs del Web Service
     */
    public static final String GET = IP  +PUERTO_HOST+ "/web_service/usuariosGetAll.php";
    public static final String GET_BY_ID = IP + PUERTO_HOST + "/web_service/usuariosGetById.php";
    public static final String UPDATE = IP + PUERTO_HOST + "/web_service/usuariosUpdate.php";
    public static final String DELETE = IP + PUERTO_HOST + "/web_service/usuariosDeleteJson.php";
    public static final String INSERT = IP + PUERTO_HOST + "/web_service/usuariosInsert.php";

    /**
     * Clave para el valor extra que representa al identificador de una meta
     */
    public static final String EXTRA_ID = "IDEXTRA";

}