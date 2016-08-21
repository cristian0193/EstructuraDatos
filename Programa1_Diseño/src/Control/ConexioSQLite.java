package Control;

import Datos.Profesor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ConexioSQLite {

    public static Connection conectar = null;
    public static Statement sentencia;
    public static ResultSet resultado;
    public static String query = "";

//METODO DE CONEXION
    public void coneccionbase() {

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            conectar = DriverManager.getConnection("jdbc:sqlite:BaseDatos.db");
            sentencia = conectar.createStatement();
            System.out.println("CONECTO BIEN ...");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("CONECTO MAL ....");
        }
    }

    //METODO CONECTAR TABLAS
    public Connection Conectar() {

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            conectar = DriverManager.getConnection("jdbc:sqlite:ValidacionesSQLite.db");
            System.out.println("CONECTO BIEN TABLA ........");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conectar;
    }

//METODOS DE DESCONEXION
    public static void cerrar() {
        try {
            conectar.close();
            System.out.println("CONEXION CERRADA ...");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("NO SE CERRO CONEXION ...");
        }
    }

//METODO DE INSERTAR PROFESOR
    public boolean insert_profesor(Profesor profesor) {
        
        try {

            query = "INSERT INTO PROFESOR "
                    + "(ID_PROFESOR, "
                    + "NOMBRE_PROFESOR, "
                    + "APELLIDO_PROFESOR ) "
                    + "VALUES "
                    + "(" + profesor.getIdProfesor() + " ,'" + profesor.getNombreProfesor()+ "', '" + profesor.getApellidoProfesor() + "') ";
            System.out.println(query);

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }
    }

    
    
}
