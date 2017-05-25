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

        } catch (ClassNotFoundException e) {
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

        callStatement = conectar.prepareCall("call prc_mesas('" + idBar + "')");

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

        callStatement = conectar.prepareCall("call prc_mesa_x_nombre('" + nombre_mesa + "','" + idBar + "')");

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

    public int validacionUser(String usuario, String password, String idRol) throws SQLException {

        int result = 0;

        ResultSet tieneDatos = null;

        callStatement = conectar.prepareCall("call prc_validacion_login('" + usuario + "','" + password + "'," + idRol + ")");

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

    public ResultSet consultaProductos() throws SQLException {

        ResultSet result = null;

        callStatement = conectar.prepareCall("call prc_productos()");

        boolean tieneDatos = callStatement.execute();

        if (tieneDatos) {
            result = callStatement.getResultSet();
        } else {
            result = null;
        }
        return result;
    }

    public ResultSet consultaClientes() throws SQLException {

        ResultSet result = null;

        callStatement = conectar.prepareCall("call prc_clientes()");

        boolean tieneDatos = callStatement.execute();

        if (tieneDatos) {
            result = callStatement.getResultSet();
        } else {
            result = null;
        }
        return result;
    }

    public ResultSet consultaUsuario() throws SQLException {

        ResultSet result = null;

        callStatement = conectar.prepareCall("call prc_usuarios()");

        boolean tieneDatos = callStatement.execute();

        if (tieneDatos) {
            result = callStatement.getResultSet();
        } else {
            result = null;
        }
        return result;
    }

    public int crearCuenta(String idMesa, String idCliente, String idUsuario) throws SQLException {

        int result = 0;

        callStatement = conectar.prepareCall("call prc_creacion_cuenta("+idMesa+","+idCliente+","+idUsuario+")");

        boolean tieneDatos = callStatement.execute();

        if(tieneDatos == false){
            result = 1;
        }                
       
        return result;
    }
    
    
    public int ingresarProductos(String cantidad, String idProdcuto, String idMesa, String idCliente, String idUsuario) throws SQLException {

        int result = 0;

        callStatement = conectar.prepareCall("call prc_guardar_detalle_factura("+cantidad+","+idProdcuto+","+idMesa+","+idCliente+","+idUsuario+")");

        boolean tieneDatos = callStatement.execute();

        if(tieneDatos == false){
            result = 1;
        }                
       
        return result;
    }
    
    public String consultaNumeroCuenta(String idMesa, String idCliente, String idUsuario) throws SQLException {

        ResultSet result = null;
        String cuenta = "";

        callStatement = conectar.prepareCall("call prc_numero_cuenta("+idMesa+","+idCliente+","+idUsuario+")");

        boolean tieneDatos = callStatement.execute();

        if (tieneDatos) {
            result = callStatement.getResultSet();
            
            while(result.next()){
                cuenta = result.getString("id");            
            }                        
        } else {
            cuenta = "";
        }
        return cuenta;
    }
    
    public ResultSet consultaClientesUsuarioCuenta(String cuenta) throws SQLException {

        ResultSet result = null;

        callStatement = conectar.prepareCall("call prc_cliente_usuario_cuenta('" + cuenta + "')");

        boolean tieneDatos = callStatement.execute();

        if (tieneDatos) {
            result = callStatement.getResultSet();
        } else {
            result = null;
        }
        return result;
    }
    
    public ResultSet consultaProductosCuenta(String cuenta) throws SQLException {

        ResultSet result = null;

        callStatement = conectar.prepareCall("call prc_productos_cuenta('" + cuenta + "')");

        boolean tieneDatos = callStatement.execute();

        if (tieneDatos) {
            result = callStatement.getResultSet();
        } else {
            result = null;
        }
        return result;
    }
    
    public int realizarPago(String cantidad, String idCuenta) throws SQLException {

        int result = 0;

        callStatement = conectar.prepareCall("call prc_insertar_pago("+cantidad+","+idCuenta+")");

        boolean tieneDatos = callStatement.execute();

        if(tieneDatos == false){
            result = 1;
        }                
       
        return result;
    }
        
    public void actualizarEstadoCuenta(String idCuenta) throws SQLException {

        callStatement = conectar.prepareCall("call prc_cambio_estado_cuenta("+idCuenta+")");

        callStatement.execute();             
       
   }
    
    
}
