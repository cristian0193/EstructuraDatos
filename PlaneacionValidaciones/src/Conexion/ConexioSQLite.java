package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexioSQLite {

    public static Connection conectar = null;
    public static Statement sentencia;
    public static ResultSet resultado;
    public static String query = "";

//METODO DE CONEXION
    public static void coneccionbase() {

        try {
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:ValidacionesSQLite.db");
            sentencia = conectar.createStatement();
            sentencia.setQueryTimeout(30);
            System.out.println("CONECTO BIEN ...");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("CONECTO MAL ....");
        }
    }

    //METODOS DE DESCONEXION DE LA BASE DE DATOS
    public static void cerrar() {
        try {
            conectar.close();
            System.out.println("CONEXION CERRADA ...");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("NO SE CERRO CONEXION ...");
        }
    }

//METODO DE INSERTAR
    public boolean insert(){
        try {
            String query = "";
            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;
        }
    }

//METODO DE ACTUALIZAR
//METODO DE ELIMINAR
//CONSULTAR    
}
