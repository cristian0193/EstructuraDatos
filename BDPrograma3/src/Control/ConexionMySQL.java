package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexionMySQL {

    public static Connection conectar;
    public static Statement sentencia;
    public static ResultSet resultado;    

    public static String DB_NAME = "disenoprograma3";
    public static String USER = "root";
    public static String PASS = "";

    public void MySQLConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DB_NAME, USER, PASS);
            System.out.println("Conectado .... ");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, ex);
        }
    }

    public static void cerrar() {
        try {
            conectar.close();
            System.out.println("Desconectado ...");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void insert(String sql) {
        try {
            sentencia = conectar.createStatement();
            sentencia.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "DATOS INSERTADO CORRECTAMENTE");
            conectar.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR : " + e.getMessage());
        }
    }

    public static void update(String sql) {
        try {
            sentencia = conectar.createStatement();
            sentencia.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADO CORRECTAMENTE");
            conectar.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR : " + e.getMessage());
        }
    }

    public static void delete(String sql) {
        try {
            sentencia = conectar.createStatement();
            sentencia.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS CORRECTAMENTE");
            conectar.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR : " + e.getMessage());
        }
    }

    public static ResultSet select(String sql) {
        try {
            sentencia = conectar.createStatement();
            resultado = sentencia.executeQuery(sql);
            System.out.println("Datos Consultados");
            return resultado;
        } catch (SQLException e) {
            System.out.println( "ERROR AL CONSULTAR : " + e.getMessage());
            return null;
        }
    }

}
