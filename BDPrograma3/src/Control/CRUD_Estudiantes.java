package Control;

import java.sql.ResultSet;

public class CRUD_Estudiantes {

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

}
