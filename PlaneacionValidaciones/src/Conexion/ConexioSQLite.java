package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    public boolean insert(String GCC,
            String NOMBRE,
            String TIPO,
            String LIDER,
            String PLANTA,
            String MAQUINA,
            String LOTE,
            String TURNO,
            String FECHA_PROPUESTA,
            String ESTADO,
            String OBSERVACION,
            String PRE_CAL_ESPECIFICACION_EQUIPO,
            String PRE_CAL_PROTOCOLOS,
            String PRE_CAL_RU_NO_GXP,
            String PRE_CAL_LIBRO_PARAMETROS,
            String PRE_CAL_BR_ACTUALIZADO,
            String PRE_CAL_SOP,
            String PRE_CAL_HOJA_VIDA,
            String PRE_CAL_RUTINA_MANTENIMIENTO,
            String PRE_CAL_CERTIFICADO_MATERIALES,
            String PRE_CAL_PLANOS,
            String PRE_CAL_MANUALES,
            String PRE_CAL_MATERIALES,
            String PRE_CAL_RECURSOS,
            String PRE_CAL_ENTRENAMIENTOS,
            String PRE_PRO_CALIFICACION_IQOQPQ,
            String PRE_PRO_ENTRENAMIENTO_HFM,
            String PRE_PRO_ENTRENAMIENTO_ESPECIFICACION,
            String PRE_PRO_ENTRENAMIENTO_TEST,
            String PRE_PRO_ENTRENAMIENTO_PROTOCOLO,
            String PRE_PRO_MATERIALES,
            String PRE_PRO_DP,
            String PRE_PRO_DIAGRAMA,
            String PRE_PRO_FMEA,
            String PRE_PRO_PR,
            String PRE_PRO_PF,
            String PRE_PRO_RM,
            String PRE_PRO_PC,
            String PRE_PRO_CG,
            String PRE_PRO_FP,
            String FECHA_REPROGRAMACION,
            String OBSERVACION_REPROGRAMACION) {

        try {

            query = "INSERT INTO PLANEACIONES_VALIDACION "
                    + "(NUMERO_REGISTRO, "
                    + "GCC_APR, "
                    + "NOMBRE_PROYECTO, "
                    + "TIPO_VALIDACION, "
                    + "LIDER_TECNICO, PLANTA, "
                    + "MAQUINA, "
                    + "LOTE, "
                    + "TURNOS, "
                    + "FECHA_PROPUESTA, "
                    + "ESTADO_PROYECTO, "
                    + "OBSERVACIONES_VALIDACION, "
                    + "PRE_CAL_ESPECIFICACION_EQUIPO, "
                    + "PRE_CAL_PROTOCOLOS, "
                    + "PRE_CAL_RU_NO_GXP, "
                    + "PRE_CAL_LIBRO_PARAMETROS, "
                    + "PRE_CAL_BR_ACTUALIZADO, "
                    + "PRE_CAL_SOP, "
                    + "PRE_CAL_HOJA_VIDA, "
                    + "PRE_CAL_RUTINA_MANTENIMIENTO, "
                    + "PRE_CAL_CERTIFICADO_MATERIALES, "
                    + "PRE_CAL_PLANOS, PRE_CAL_MANUALES, "
                    + "PRE_CAL_MATERIALES, PRE_CAL_RECURSOS, "
                    + "PRE_CAL_ENTRENAMIENTOS, "
                    + "PRE_PRO_CALIFICACION_IQOQPQ, "
                    + "PRE_PRO_ENTRENAMIENTO_HFM, "
                    + "PRE_PRO_ENTRENAMIENTO_ESPECIFICACION, "
                    + "PRE_PRO_ENTRENAMIENTO_TEST, "
                    + "PRE_PRO_ENTRENAMIENTO_PROTOCOLO, "
                    + "PRE_PRO_MATERIALES, "
                    + "PRE_PRO_DP, "
                    + "PRE_PRO_DIAGRAMA, "
                    + "PRE_PRO_FMEA, "
                    + "PRE_PRO_PR, "
                    + "PRE_PRO_PF, "
                    + "PRE_PRO_RM, "
                    + "PRE_PRO_PC, "
                    + "PRE_PRO_CG, "
                    + "PRE_PRO_FP, "
                    + "FECHA_REPROGRAMACION, "
                    + "OBSERVACION_REPROGRAMACION) "
                    + "VALUES "
                    + "(NULL,'" + GCC + "' ,'" + NOMBRE + "', '" + TIPO + "', '" + LIDER + "', '" + PLANTA + "', '" + MAQUINA + "',"
                    + "" + LOTE + ", " + TURNO + ",'" + FECHA_PROPUESTA + "' , '" + ESTADO + "', '" + OBSERVACION + "',"
                    + "'" + PRE_CAL_ESPECIFICACION_EQUIPO + "', '" + PRE_CAL_PROTOCOLOS + "', '" + PRE_CAL_RU_NO_GXP + "',"
                    + "'" + PRE_CAL_LIBRO_PARAMETROS + "', '" + PRE_CAL_BR_ACTUALIZADO + "', '" + PRE_CAL_SOP + "',"
                    + " '" + PRE_CAL_HOJA_VIDA + "', '" + PRE_CAL_RUTINA_MANTENIMIENTO + "', '" + PRE_CAL_CERTIFICADO_MATERIALES + "', "
                    + "'" + PRE_CAL_PLANOS + "', '" + PRE_CAL_MANUALES + "', '" + PRE_CAL_MATERIALES + "',"
                    + "'" + PRE_CAL_RECURSOS + "', '" + PRE_CAL_ENTRENAMIENTOS + "', '" + PRE_PRO_CALIFICACION_IQOQPQ + "',"
                    + "'" + PRE_PRO_ENTRENAMIENTO_HFM + "', '" + PRE_PRO_ENTRENAMIENTO_ESPECIFICACION + "', '" + PRE_PRO_ENTRENAMIENTO_TEST + "',"
                    + "'" + PRE_PRO_ENTRENAMIENTO_PROTOCOLO + "', '" + PRE_PRO_MATERIALES + "', '" + PRE_PRO_DP + "',"
                    + "'" + PRE_PRO_DIAGRAMA + "', '" + PRE_PRO_FMEA + "', '" + PRE_PRO_PR + "', '" + PRE_PRO_PF + "', "
                    + "'" + PRE_PRO_RM + "', '" + PRE_PRO_PC + "', '" + PRE_PRO_CG + "', '" + PRE_PRO_FP + "', "
                    + "'" + FECHA_REPROGRAMACION + "', '" + OBSERVACION_REPROGRAMACION + "')";
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

//METODO 
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
}
