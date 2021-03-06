package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexionDB {

    public static Connection conectar = null;
    public static Statement sentencia;
    public static ResultSet resultado;
    public static String query = "";

//METODO DE CONEXION
    public Connection Conectar() { // metodo para generar la conexion a la base de datos.

        try {
            Class.forName("com.mysql.jdbc.Driver"); // identificamos el nombre le JDBC
            
            String url = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10205140";
            String usuarioMysql = "sql10205140";
            String contrasena = "H7vnwKV4In";
            
            // pasamos la ruta del driver para la conexion a la base de datos, en este caso es una base de datos local.
            conectar = DriverManager.getConnection(url,usuarioMysql,contrasena); 
            System.out.println("Conecto");
        } catch (ClassNotFoundException | SQLException e) { 
            JOptionPane.showMessageDialog(null, "ERROR al Conectar : " + e.getMessage());
        } 

        return conectar;
    }

//METODOS DE DESCONEXION
    public static void cerrar() { // metodo para realizar el cierre de la conexion a la base de datos
        try {
            conectar.close(); 
            System.out.println("CONEXION CERRADA ...");
        } catch (Exception e) {
            System.out.println("NO SE CERRO CONEXION ... ERROR : " + e.getMessage());
        }
    }



}
