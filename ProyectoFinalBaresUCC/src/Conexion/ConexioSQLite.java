package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexioSQLite {

    public static Connection conectar = null;
    public static Statement sentencia;
    public static ResultSet resultado;
    public static String query = "";

    public void coneccionbase() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/baresucc", "root", "");
            sentencia = conectar.createStatement();
            System.out.println("CONECTADO");
        } catch (Exception e) {
            System.err.println(e.getMessage());            
        }
    }

    public Connection Conectar() throws Exception {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/baresucc", "root", "");
            System.out.println("CONECTADO");
            return conectar;

        } catch (ClassNotFoundException | SQLException e ) {
            System.err.println(e.getMessage());
            throw e;
        }
        
    }

    public static void cerrar() {
        try {
            conectar.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());            
        }
    }

}