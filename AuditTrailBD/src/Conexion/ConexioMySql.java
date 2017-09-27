package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexioMySql {

    public static Connection conectar = null;
    public static Statement sentencia;
    public static ResultSet resultado;
    public static String query = "";
    public static String queryAudituria = "";

//METODO DE CONEXION
    public void coneccionbase() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            String DSN = "jdbc:mysql://localhost:3306/manufactura";
            String user = "root";
            String password = "";
            conectar = DriverManager.getConnection(DSN, user, password);
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
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            String DSN = "jdbc:mysql://localhost/manufactura";
            String user = "root";
            String password = "";
            conectar = DriverManager.getConnection(DSN, user, password);
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

    //METODO DE INSERTAR
    public boolean insertarArteVigente(String COD_PRODUCTO,
            String DESCRIPCION_PRODUCTO,
            String COD_MATERIAL,
            String DESCRIPCION_MATERAL,
            String ARTE_VIGENTE,
            String TIPO_ETIQUETA,
            String MOTIVO_CAMBIO,
            String USUARIO) {

        try {

            String ARTE_ANTERIOR = "";

            queryAudituria = "SELECT ARTE_VIGENTE FROM arte_vigente WHERE COD_PRODUCTO = " + COD_PRODUCTO + " AND " + COD_MATERIAL + " ORDER BY FECHA_CREACION ASC LIMIT 1;";
            resultado = sentencia.executeQuery(queryAudituria);

            while (resultado.next()) {
                ARTE_ANTERIOR = resultado.getString("ARTE_VIGENTE");
            }

            query = "INSERT INTO arte_vigente "
                    + "(ID, "
                    + "COD_PRODUCTO, "
                    + "DESCRIPCION_PRODUCTO, "
                    + "COD_MATERIAL, "
                    + "DESCRIPCION_MATERAL,"
                    + "ARTE_VIGENTE, "
                    + "TIPO_ETIQUETA, "
                    + "MOTIVO_CAMBIO, "
                    + "FECHA_CREACION) "
                    + "VALUES "
                    + "(NULL,'" + COD_PRODUCTO + "' ,"
                    + "'" + DESCRIPCION_PRODUCTO + "',"
                    + "'" + COD_MATERIAL + "',"
                    + "'" + DESCRIPCION_MATERAL + "',"
                    + "'" + ARTE_VIGENTE + "',"
                    + "'" + TIPO_ETIQUETA + "',"
                    + "'" + MOTIVO_CAMBIO + "', NOW())";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            insertarAuditoria(COD_MATERIAL, COD_PRODUCTO, ARTE_ANTERIOR, ARTE_VIGENTE, USUARIO, "INSERT", "ARTE_VIGENTE");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }
    }

//METODO DE ACTUALIZAR REGISTROS
    public boolean upgradeArteVigente(String ID,
            String COD_PRODUCTO,
            String DESCRIPCION_PRODUCTO,
            String COD_MATERIAL,
            String DESCRIPCION_MATERAL,
            String ARTE_VIGENTE,
            String TIPO_ETIQUETA,
            String MOTIVO_CAMBIO,
            String USUARIO) {

        try {

            String ARTE_ANTERIOR = "";

            queryAudituria = "SELECT ARTE_VIGENTE FROM arte_vigente WHERE COD_PRODUCTO = " + COD_PRODUCTO + " AND " + COD_MATERIAL + " ORDER BY FECHA_CREACION ASC LIMIT 1;";
            resultado = sentencia.executeQuery(queryAudituria);

            while (resultado.next()) {
                ARTE_ANTERIOR = resultado.getString("ARTE_VIGENTE");
            }

            query = "UPDATE"
                    + " arte_vigente"
                    + " SET "
                    + "  COD_PRODUCTO = '" + COD_PRODUCTO + "',"
                    + "  DESCRIPCION_PRODUCTO = '" + DESCRIPCION_PRODUCTO + "',"
                    + "  COD_MATERIAL = '" + COD_MATERIAL + "',"
                    + "  DESCRIPCION_MATERAL = '" + DESCRIPCION_MATERAL + "',"
                    + "  ARTE_VIGENTE = '" + ARTE_VIGENTE + "',"
                    + "  TIPO_ETIQUETA = '" + TIPO_ETIQUETA + "',"
                    + "  MOTIVO_CAMBIO = '" + MOTIVO_CAMBIO + "'"
                    + " WHERE"
                    + "  ID = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("ACTUALIZADO ...");

            insertarAuditoria(COD_MATERIAL, COD_PRODUCTO, ARTE_ANTERIOR, ARTE_VIGENTE, USUARIO, "UPDATE", "ARTE_VIGENTE");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ACTUALIZADO ...");
            return false;

        }
    }

    //METODO PARA ELIMINAR TIPO VALIDACION
    public boolean deleteArteVigente(String ID,
            String COD_PRODUCTO,
            String DESCRIPCION_PRODUCTO,
            String COD_MATERIAL,
            String DESCRIPCION_MATERAL,
            String ARTE_VIGENTE,
            String TIPO_ETIQUETA,
            String MOTIVO_CAMBIO,
            String USUARIO) {

        try {
           
            String ARTE_ANTERIOR = "";

            queryAudituria = "SELECT ARTE_VIGENTE FROM arte_vigente WHERE COD_PRODUCTO = " + COD_PRODUCTO + " AND " + COD_MATERIAL + " ORDER BY FECHA_CREACION ASC LIMIT 1;";
            resultado = sentencia.executeQuery(queryAudituria);

            while (resultado.next()) {
                ARTE_ANTERIOR = resultado.getString("ARTE_VIGENTE");
            }

            insertarAuditoria(COD_MATERIAL, COD_PRODUCTO, ARTE_ANTERIOR, ARTE_VIGENTE, USUARIO, "DELETE", "ARTE_VIGENTE");

            query = "DELETE FROM arte_vigente WHERE ID = " + ID + "";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }

    //METODO DE INSERTAR AUDITORIA
    public boolean insertarAuditoria(String COD_MATERIA,
            String COD_PRODUCTO,
            String ARTE_ANTERIOR,
            String ARTE_NUEVO,
            String USUARIO,
            String OPERACION,
            String TABLA) {

        try {

            query = "INSERT INTO auditoria "
                    + "(ID, "
                    + "COD_MATERIA, "
                    + "COD_PRODUCTO, "
                    + "ARTE_ANTERIOR, "
                    + "ARTE_NUEVO,"
                    + "USUARIO, "
                    + "OPERACION, "
                    + "TABLA, "
                    + "FECHA_MODIFICACION ) "
                    + "VALUES "
                    + "(NULL,'" + COD_MATERIA + "' ,"
                    + "'" + COD_PRODUCTO + "',"
                    + "'" + ARTE_ANTERIOR + "',"
                    + "'" + ARTE_NUEVO + "',"
                    + "'" + USUARIO + "',"
                    + "'" + OPERACION + "',"
                    + "'" + TABLA + "', NOW())";
            System.out.println(query);

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO AUDITORIA ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("AUDITORIA NO REGISTRADA ...");
            return false;

        }
    }

}
