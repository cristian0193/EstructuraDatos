package Control;

import Modelo.Cursos;
import Modelo.Estudiantes;
import java.sql.ResultSet;

public class CRUD_Estudiantes {

    
    //METODO DE INSERTAR PROFESOR
    public static boolean insert_estudiante(Estudiantes estudiante) {
        String query = "";
        try {
            query = "INSERT INTO ESTUDIANTE "
                    + "(ID_ESTUDIANTE, "
                    + "NOMBRE_ESTUDIANTE, "
                    + "APELLIDO_ESTUDIANTE,"
                    + "ID_CURSO) "
                    + "VALUES "
                    + "(" + estudiante.getIdEstudiante() + " ,'" + estudiante.getNombreEstudiante() + "', '" + estudiante.getApellidoEstudiante()+ "', " + estudiante.getIdCursos().getIdCursos()+ "); ";
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
    
    public static ResultSet Consultar_Estudiante(int id_profesor) {
        String query = "";
        ResultSet resultado;
        try {
            query = "SELECT E.ID_ESTUDIANTE, E.NOMBRE_ESTUDIANTE, E.APELLIDO_ESTUDIANTE "
                + "FROM ESTUDIANTES E, CURSOS C "
                + "WHERE E.ID_CURSOS = C.ID_CURSOS "
                + "AND C.ID_CURSOS = " + id_profesor;

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
    
    public static ResultSet Consultar_Estudiante_Matriculado() {
        String query = "";
        ResultSet resultado;
        try {
            query = "SELECT E.ID_ESTUDIANTE, E.NOMBRE_ESTUDIANTE, E.APELLIDO_ESTUDIANTE, C.NOMBRE_CURSO "
                + "FROM "
                + "ESTUDIANTE E, CURSO C "
                + "WHERE E.ID_CURSO = C.ID_CURSO ";

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
    
}
