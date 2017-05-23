package Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexioSQLite {

    public CallableStatement callStatement;
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

        } catch (ClassNotFoundException | SQLException e) {
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

    public ResultSet consultaMesas(String idBar) throws SQLException {

        ResultSet result = null;

        callStatement = conectar.prepareCall("call prc_mesas('"+idBar+"')");

        boolean tieneDatos = callStatement.execute();

        if (tieneDatos) {
            result = callStatement.getResultSet();
        } else {
            result = null;
        }
        return result;
    }

    public ResultSet consultaMesasxNombre(String nombre_mesa, String idBar) throws SQLException {

        ResultSet result = null;

        callStatement = conectar.prepareCall("call prc_mesa_x_nombre('"+nombre_mesa+"','"+idBar+"')");        
        
        boolean tieneDatos = callStatement.execute();

        if (tieneDatos) {
            result = callStatement.getResultSet();
        } else {
            result = null;
        }
        return result;
    }
    
    public ResultSet consultaBares() throws SQLException {

        ResultSet result = null;

        callStatement = conectar.prepareCall("call prc_bares()");        
        
        boolean tieneDatos = callStatement.execute();

        if (tieneDatos) {
            result = callStatement.getResultSet();
        } else {
            result = null;
        }
        return result;
    }
    
    public int validacionUser(String usuario, String password,String idRol) throws SQLException {

        int result = 0;
        
        ResultSet tieneDatos = null;

        callStatement = conectar.prepareCall("call prc_validacion_login('"+usuario+"','"+password+"',"+idRol+")");        
        
        callStatement.execute();
        
        tieneDatos = callStatement.getResultSet();
        tieneDatos.last();
        
        result = tieneDatos.getRow();

        if (result == 0) {
            result = 0;
        } else {
            result = 1;
        }
        return result;
    }
    
    
    public ResultSet consultaRoles() throws SQLException {

        ResultSet result = null;

        callStatement = conectar.prepareCall("call prc_roles()");        
        
        boolean tieneDatos = callStatement.execute();

        if (tieneDatos) {
            result = callStatement.getResultSet();
        } else {
            result = null;
        }
        return result;
    }
    
}
