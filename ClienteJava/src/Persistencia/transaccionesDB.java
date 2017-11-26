package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class transaccionesDB {

    public static Connection conectar = null;
    public static Statement sentencia;
    public static ResultSet resultado;
    public static String query = "";

    public Connection Conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url1 = "jdbc:mysql:loadbalance://192.168.0.3:3306,192.168.0.5:3306/tallerfinal9?loadBalanceConnectionGroup=first&loadBalanceEnableJMX=true";
            String usuarioMysql1 = "maestro1";
            String contrasena1 = "1234";

            conectar = DriverManager.getConnection(url1, usuarioMysql1, contrasena1);
            System.out.println("Conecto ");
                        
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR al Conectar : " + e.getMessage());
        }

        return conectar;
    }

    public void insert(String sql) {

        try {
            sentencia = conectar.createStatement(); 
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la Transaccion Insert : " + ex.getMessage());
        }

    }

    public ResultSet select(String sql) {

        try {
            sentencia = conectar.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la Transaccion Consulta : " + ex.getMessage());
        }

        return resultado;
    }

    public void update(String sql) {

        try {
            sentencia = conectar.createStatement(); 
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la Transaccion Update : " + ex.getMessage());
        }

    }

    public void delete(String sql) {

        try {
            sentencia = conectar.createStatement(); 
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la Transaccion Delete : " + ex.getMessage());
        }

    }

    public static void cerrar() { 
        try {
            conectar.close();
            System.out.println("CONEXION CERRADA ...");
        } catch (Exception e) {
            System.out.println("NO SE CERRO CONEXION ... ERROR : " + e.getMessage());
        }
    }
}
