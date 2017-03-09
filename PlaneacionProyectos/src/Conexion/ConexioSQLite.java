package Conexion;

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
            conectar = DriverManager.getConnection("jdbc:sqlite:ValidacionesSQLite.db");
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

//METODO DE INSERTAR
    public boolean insert_proyecto(String DESCRIPCION,
            String CAPEX,
            String CAPEX_ACTUAL,
            String DIFERENCIA ) {

        try {

            query = "INSERT INTO PROYECTOS "
                    + "(ID, "
                    + "DESCRIPCION, "
                    + "CAPEX, "
                    + "CAPEX_ACTUAL, "
                    + "DIFERENCIA,"
                    + "ESTADO ) "
                    + "VALUES "
                    + "(NULL,'" + DESCRIPCION + "' ," + CAPEX + ", " + CAPEX_ACTUAL + ", " + DIFERENCIA + ",'CREADO') ";
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

    //METODO DE ACTUALIZAR REGISTROS
//    public boolean upgrade(String REGISTRO,
//            String GCC,
//            String NOMBRE,
//            String TIPO,
//            String LIDER,
//            String PLANTA,
//            String MAQUINA,
//            String LOTE,
//            String TURNO,
//            String FECHA_PROPUESTA,
//            String ESTADO,
//            String OBSERVACION,
//            int SEMANA) {
//
//        try {
//
//            query = "UPDATE"
//                    + " PLANEACIONES_VALIDACION"
//                    + " SET "
//                    + "  GCC_APR = '" + GCC + "',"
//                    + "  NOMBRE_PROYECTO = '" + NOMBRE + "',"
//                    + "  TIPO_VALIDACION = '" + TIPO + "',"
//                    + "  LIDER_TECNICO = '" + LIDER + "',"
//                    + "  PLANTA = '" + PLANTA + "',"
//                    + "  MAQUINA = '" + MAQUINA + "',"
//                    + "  LOTE = '" + LOTE + "',"
//                    + "  TURNOS = '" + TURNO + "',"
//                    + "  FECHA_PROPUESTA = '" + FECHA_PROPUESTA + "',"
//                    + "  ESTADO_PROYECTO = '" + ESTADO + "',"
//                    + "  OBSERVACIONES_VALIDACION = '" + OBSERVACION + "',"
//                    + "  SEMANA = '" + SEMANA + "'"
//                    + " WHERE"
//                    + "  NUMERO_REGISTRO = " + REGISTRO + ";";
//
//            sentencia.executeUpdate(query);
//            System.out.println("ACTUALIZADO ...");
//
//            return true;
//
//        } catch (SQLException e) {
//
//            System.err.println(e.getMessage());
//            System.out.println("NO ACTUALIZADO ...");
//            return false;
//
//        }
//    }
    
    //METODO PARA ELIMINAR 
//    public boolean delete_tipo(String REGISTRO) {
//
//        try {
//
//            query = "DELETE FROM TIPO WHERE ID_TIPO = " + REGISTRO + "";
//
//            sentencia.executeUpdate(query);
//            System.out.println("ELIMINADO ...");
//
//            return true;
//
//        } catch (SQLException e) {
//
//            System.err.println(e.getMessage());
//            System.out.println("NO ELIMINADO ...");
//            return false;
//
//        }
//    }
    
    
}
