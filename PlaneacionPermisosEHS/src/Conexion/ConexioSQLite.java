package Conexion;

import java.io.File;
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
      
    final File archivo = new File("ValidacionesEHS.db");
    
//METODO DE CONEXION
    public void coneccionbase() {

        try {            
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:" + archivo);
            sentencia = conectar.createStatement();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }

//METODO CONECTAR TABLAS
    public Connection Conectar() {

        try {    
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:" + archivo);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
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
    public boolean insertPermisoGeneral(String ID_PERMISO,
            String FECHA,
            String EMPRESA,
            String LUGAR_TRABAJO,
            String ACTIVIDAD,
            String CONTRATISTAS,
            String RESPONSABLE_JNJ,
            String ESTADO,
            String TIPO) {
        try {
            query = "INSERT INTO PERMISOS_GENERALES "
                    + "(ID, "
                    + "ID_PERMISO, "
                    + "FECHA, "
                    + "EMPRESA, "
                    + "LUGAR_TRABAJO, "
                    + "ACTIVIDAD, "
                    + "CONTRATISTAS, "
                    + "RESPONSABLE_JNJ, "
                    + "ESTADO, "
                    + "TIPO_PERMISO) "
                    + "VALUES "
                    + "(NULL,'" + ID_PERMISO + "' ,'" + FECHA + "' ,'" + EMPRESA + "', '" + LUGAR_TRABAJO + "',"
                    + "      '" + ACTIVIDAD + "', '" + CONTRATISTAS + "', '" + RESPONSABLE_JNJ + "',"
                    + "      '" + ESTADO + "','" + TIPO + "') ";
           
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
    public boolean upgradePermisoGeneral(String ID,
            String ID_PERMISO,
            String FECHA,
            String EMPRESA,
            String LUGAR_TRABAJO,
            String ACTIVIDAD,
            String CONTRATISTAS,
            String RESPONSABLE_JNJ,            
            String ESTADO,
            String TIPO_PERMISO) {

        try {

            query = "UPDATE"
                    + " PERMISOS_GENERALES"
                    + " SET "
                    + "  ID_PERMISO = '" + ID_PERMISO + "',"
                    + "  FECHA = '" + FECHA + "',"
                    + "  EMPRESA = '" + EMPRESA + "',"
                    + "  LUGAR_TRABAJO = '" + LUGAR_TRABAJO + "',"
                    + "  ACTIVIDAD = '" + ACTIVIDAD + "',"
                    + "  CONTRATISTAS = '" + CONTRATISTAS + "',"
                    + "  RESPONSABLE_JNJ = '" + RESPONSABLE_JNJ + "',"
                    + "  ESTADO = '" + ESTADO + "',"
                    + "  TIPO_PERMISO = '" + TIPO_PERMISO + "'"                    
                    + " WHERE"
                    + "  ID = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("ACTUALIZADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ACTUALIZADO ...");
            return false;

        }
    }

   //METODO DE INSERTAR
    public boolean insertPermiso(String NOMBRE_PERMISO,
            String ID_GENERAL,
            String ID_PERMISO_GENERAL,
            String ID_PERMISO,
            String INDICADOR_PERMISO,
            String ESTADO) {
        try {
            query = "INSERT INTO PERMISOS "
                    + "(ID, "
                    + "NOMBRE_PERMISO, "
                    + "FECHA, "
                    + "ID_GENERAL, "
                    + "ID_PERMISO_GENERAL, "
                    + "ID_PERMISO, "
                    + "INDICADOR_PERMISO, "
                    + "ESTADO) "
                    + "VALUES "
                    + "(NULL,'" + NOMBRE_PERMISO + "' ,DATE('NOW'), '" + ID_GENERAL + "','" + ID_PERMISO_GENERAL + "','" + ID_PERMISO + "', '" + INDICADOR_PERMISO + "', '" + ESTADO + "') ";
           
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
    public boolean upgradePermiso(String ID,
            String FECHA,
            String ID_GENERAL,
            String ID_PERMISO,
            String INDICADOR_PERMISO,
            String ESTADO) {

        try {

            query = "UPDATE"
                    + " PERMISOS"
                    + " SET "
                    + "  FECHA = '" + FECHA + "',"
                    + "  ID_GENERAL = '" + ID_GENERAL + "',"
                    + "  ID_PERMISO = '" + ID_PERMISO + "',"
                    + "  INDICADOR_PERMISO = '" + INDICADOR_PERMISO + "',"
                    + "  ESTADO = '" + ESTADO + "'"                 
                    + " WHERE"
                    + "  ID = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("ACTUALIZADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ACTUALIZADO ...");
            return false;

        }
    }
    
    //METODO PARA INSERTAR EMPRESAS
    public boolean insert_empresa(
            String NOMBRE) {

        try {
            query = "INSERT INTO EMPRESAS "
                    + "(ID, NOMBRE)"
                    + " VALUES "
                    + " (NULL,'" + NOMBRE.toUpperCase() + "')";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }

    //METODO PARA ACTUALIZAR EMPRESA
    public boolean upgrade_empresa(String ID,
            String NOMBRE) {

        try {
            query = "UPDATE"
                    + " EMPRESAS "
                    + " SET "
                    + "  NOMBRE = '" + NOMBRE + "'"
                    + " WHERE"
                    + "  ID = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }

    //METODO PARA ELIMINAR EMPRESAS
    public boolean delete_empresa(String REGISTRO) {

        try {

            query = "DELETE FROM EMPRESAS WHERE ID = " + REGISTRO + "";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }

    //METODO PARA INSERTAR LUGAR
    public boolean insert_lugar(
            String NOMBRE) {

        try {
            query = "INSERT INTO LUGAR_TRABAJO "
                    + "(ID, NOMBRE)"
                    + " VALUES "
                    + " (NULL,'" + NOMBRE.toUpperCase() + "')";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }

    //METODO PARA ACTUALIZAR LUGAR
    public boolean upgrade_lugar(String ID,
            String NOMBRE) {

        try {
            query = "UPDATE"
                    + " LUGAR_TRABAJO "
                    + " SET "
                    + "  NOMBRE = '" + NOMBRE + "'"
                    + " WHERE"
                    + "  ID = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }

    //METODO PARA ELIMINAR LUGAR
    public boolean delete_lugar(String REGISTRO) {

        try {

            query = "DELETE FROM LUGAR_TRABAJO WHERE ID = " + REGISTRO + "";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
    
    //METODO PARA INSERTAR ACTIVIDAD
    public boolean insert_actividad(
            String NOMBRE) {

        try {
            query = "INSERT INTO ACTIVIDAD "
                    + "(ID, NOMBRE)"
                    + " VALUES "
                    + " (NULL,'" + NOMBRE.toUpperCase() + "')";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }

    //METODO PARA ACTUALIZAR ACTIVIDAD
    public boolean upgrade_actividad(String ID,
            String NOMBRE) {

        try {
            query = "UPDATE"
                    + " ACTIVIDAD "
                    + " SET "
                    + "  NOMBRE = '" + NOMBRE + "'"
                    + " WHERE"
                    + "  ID = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }

    //METODO PARA ELIMINAR ACTIVIDAD
    public boolean delete_actividad(String REGISTRO) {

        try {

            query = "DELETE FROM ACTIVIDAD WHERE ID = " + REGISTRO + "";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
    
     //METODO PARA INSERTAR CONTRATISTA
    public boolean insert_contratista(
            String NOMBRE) {

        try {
            query = "INSERT INTO CONTRATISTA "
                    + "(ID, NOMBRE)"
                    + " VALUES "
                    + " (NULL,'" + NOMBRE.toUpperCase() + "')";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }

    //METODO PARA ACTUALIZAR ACTIVIDAD
    public boolean upgrade_contratista(String ID,
            String NOMBRE) {

        try {
            query = "UPDATE"
                    + " CONTRATISTA "
                    + " SET "
                    + "  NOMBRE = '" + NOMBRE + "'"
                    + " WHERE"
                    + "  ID = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }

    //METODO PARA ELIMINAR CONTRATISTA
    public boolean delete_contratista(String REGISTRO) {

        try {

            query = "DELETE FROM CONTRATISTA WHERE ID = " + REGISTRO + "";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
        
     //METODO PARA INSERTAR CONTRATISTA
    public boolean insert_responsable(
            String NOMBRE) {

        try {
            query = "INSERT INTO RESPONSABLE_JNJ "
                    + "(ID, NOMBRE)"
                    + " VALUES "
                    + " (NULL,'" + NOMBRE.toUpperCase() + "')";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }

    //METODO PARA ACTUALIZAR ACTIVIDAD
    public boolean upgrade_responsable(String ID,
            String NOMBRE) {

        try {
            query = "UPDATE"
                    + " RESPONSABLE_JNJ "
                    + " SET "
                    + "  NOMBRE = '" + NOMBRE + "'"
                    + " WHERE"
                    + "  ID = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }

    //METODO PARA ELIMINAR CONTRATISTA
    public boolean delete_responsable(String REGISTRO) {

        try {

            query = "DELETE FROM RESPONSABLE_JNJ WHERE ID = " + REGISTRO + "";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
                
    public boolean eliminacion_masiva_permisos(String fechaIncial, String fechaFinal) {

        try {

            query = "DELETE FROM PERMISOS WHERE FECHA BETWEEN '" + fechaIncial + "' AND '" + fechaFinal + "'";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
    
    public boolean eliminacion_masiva_permisos_general(String fechaIncial, String fechaFinal) {

        try {

            query = "DELETE FROM PERMISOS_GENERALES  WHERE FECHA BETWEEN '" + fechaIncial + "' AND '" + fechaFinal + "'";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
    
    public boolean delete_registro_permiso(String ID) {

        try {

            query = "DELETE FROM PERMISOS  WHERE ID = " + ID + "";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
    
     public boolean delete_registro_permiso_general(String ID) {

        try {

            query = "DELETE FROM PERMISOS_GENERALES  WHERE ID = " + ID + "";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
    
    public boolean upgrade_cierre_permiso_general(String ID) {

        try {
            query = "UPDATE"
                    + " PERMISOS_GENERALES "
                    + " SET "
                    + "  ESTADO = 'Cerrado'"
                    + " WHERE"
                    + "  ID = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }
    }
    
    public boolean upgrade_anular_permiso_general(String ID) {

        try {
            query = "UPDATE"
                    + " PERMISOS_GENERALES "
                    + " SET "
                    + "  ESTADO = 'Anulado'"
                    + " WHERE"
                    + "  ID = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }
    }

    public boolean upgrade_perdido_permiso_general(String ID) {

        try {
            query = "UPDATE"
                    + " PERMISOS_GENERALES "
                    + " SET "
                    + "  ESTADO = 'Perdido'"
                    + " WHERE"
                    + "  ID = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }
    }
    
     public boolean upgrade_cierre_permiso(String ID) {

        try {
            query = "UPDATE"
                    + " PERMISOS "
                    + " SET "
                    + "  ESTADO = 'Cerrado'"
                    + " WHERE"
                    + "  ID = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }
    }
    
    public boolean upgrade_anular_permiso(String ID) {

        try {
            query = "UPDATE"
                    + " PERMISOS "
                    + " SET "
                    + "  ESTADO = 'Anulado'"
                    + " WHERE"
                    + "  ID = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }
    }

    public boolean upgrade_perdido_permiso(String ID) {

        try {
            query = "UPDATE"
                    + " PERMISOS "
                    + " SET "
                    + "  ESTADO = 'Perdido'"
                    + " WHERE"
                    + "  ID = " + ID + ";";

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
