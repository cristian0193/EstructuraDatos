package Control;

import Modelo.Profesores;
import Modelo.Cursos;

import java.sql.ResultSet;

public class CRUD_Cursos {
    
//METODO DE CONSULTAR CURSO DE LISTA
    public static ResultSet Consultar_Cursos_Lista() {
        String query = "";
        ResultSet resultado;
        try {
            query = "SELECT ID_CURSOS FROM CURSOS ";

            System.out.println(query);
            ConexionMySQL conexion = new ConexionMySQL();
            conexion.MySQLConnection();
            resultado = ConexionMySQL.select(query);
            System.out.println("CONSULTADO ...");
            return resultado;

        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("NO SE CONSULTO...");
            return null;
        }

    }

//METODO DE CONSULTAR CURSOS DE TABLA
    public static ResultSet Consultar_Cursos_Tabla() {
        String query = "";
        ResultSet resultado;
        try {
            query = "SELECT C.ID_CURSOS,C.NOMBRE_CURSO, C.NUMERO_CREDITOS, C.ACTIVIDAD_CURSOS, P.NOMBRE_PROFESOR "
                    + "FROM "
                    + "PROFESORES P, CURSOS C "
                    + "WHERE P.ID_PROFESOR = C.ID_PROFESOR ";

            System.out.println(query);
            ConexionMySQL conexion = new ConexionMySQL();
            conexion.MySQLConnection();
            resultado = ConexionMySQL.select(query);
            System.out.println("CONSULTADO ...");
            return resultado;

        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("NO SE CONSULTO...");
            return null;
        }

    }

//METODO DE INSERTAR PROFESOR
    public static boolean insert_curso(Cursos curso) {
        String query = "";
        try {
            query = "INSERT INTO CURSOS "
                    + "(ID_CURSOS, "
                    + "NUMERO_CREDITOS, "
                    + "ACTIVIDAD_CURSOS,"
                    + "ID_PROFESOR, "
                    + "NOMBRE_CURSO ) "
                    + "VALUES "
                    + "(" + curso.getIdCursos()+ " ,'" + curso.getNumeroCreditos() + "', '" + curso.getActividadCursos() + "', " + curso.getIdProfesor().getIdProfesor() + ", '" + curso.getNombreCurso() + "'); ";
            System.out.println(query);            
            ConexionMySQL conexion = new ConexionMySQL();
            conexion.MySQLConnection();
            ConexionMySQL.insert(query);
            ConexionMySQL.cerrar();                       
            return true;

        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }    
    
}
