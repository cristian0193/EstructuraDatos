package Conexion;

import Datos.*;
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

 //METODO DE INSERTAR PROFESOR
    public boolean insert_profesor(Profesor profesor) {

        try {

            query = "INSERT INTO PROFESOR "
                    + "(ID_PROFESOR, "
                    + "NOMBRE_PROFESOR, "
                    + "APELLIDO_PROFESOR ) "
                    + "VALUES "
                    + "(" + profesor.getIdProfesor() + " ,'" + profesor.getNombreProfesor() + "', '" + profesor.getApellidoProfesor() + "'); ";
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
    
//METODO DE INSERTAR CURSO
    public boolean insert_curso(Curso curso) {

        try {

            query = "INSERT INTO CURSO "
                    + "(ID_CURSO, "
                    + "NUMERO_CREDITOS, "
                    + "ACTIVIDAD_CURSO,"
                    + "ID_PROFESOR, "
                    + "NOMBRE_CURSO ) "
                    + "VALUES "
                    + "(" + curso.getIdCurso() + " ,'" + curso.getNumeroCreditos() + "', '" + curso.getActividadesCurso() + "', " + curso.getProfesor().getIdProfesor() + ", '" + curso.getNombreCurso() + "'); ";
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

//METODO DE INSERTAR ESTUDIANTE
    public boolean insert_estudiante(Estudiante estudiante) {

        try {

            query = "INSERT INTO ESTUDIANTE "
                    + "(ID_ESTUDIANTE, "
                    + "NOMBRE_ESTUDIANTE, "
                    + "APELLIDO_ESTUDIANTE,"
                    + "ID_CURSO) "
                    + "VALUES "
                    + "(" + estudiante.getIdEstudiante() + " ,'" + estudiante.getNombreEstudiante() + "', '" + estudiante.getApellidoEstudiante()+ "', " + estudiante.getCurso().getIdCurso() + "); ";
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

//METODO DE INSERTAR NOTAS
    public boolean insert_nota(Notas notas) {

        try {

            query = "INSERT INTO NOTAS "
                    + "(ID_NOTA, "
                    + "NOTA_1, "
                    + "NOTA_2, "
                    + "NOTA_3, "
                    + "ID_CURSO, "
                    + "ID_ESTUDIANTE) "
                    + "VALUES "
                    + "(NULL ," + notas.getNota1()+ ", " + notas.getNota2()+ ", " + notas.getNota3() + ", " + notas.getCurso().getIdCurso()+ ", " + notas.getEstudiante().getIdEstudiante()+ "); ";
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
