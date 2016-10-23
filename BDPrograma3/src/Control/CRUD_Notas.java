package Control;

import Interfaces.CalculoNota;
import Modelo.Cursos;
import Modelo.Notas;
import java.sql.ResultSet;

public class CRUD_Notas {

    //METODO DE CONSULTAR NOTAS
    public static ResultSet Consultar_Notas_Registradas() {
        String query = "";
        ResultSet resultado;
        try {
            query = "SELECT (E.NOMBRE_ESTUDIANTE||\"  \"|| E.APELLIDO_ESTUDIANTE) AS NOMBRE ,C.NOMBRE_CURSO,N.NOTA_1,N.NOTA_2, N.NOTA_3 "
                + "FROM NOTAS N, CURSOS C , ESTUDIANTES E "
                + "WHERE N.ID_ESTUDIANTE = E.ID_ESTUDIANTE "
                + "AND N.ID_CURSOS = C.ID_CURSOS; ";

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
    
    //METODO DE INSERTAR NOTAS
    public static boolean insert_notas(Notas notas) {
        String query = "";
        try {
            query = "INSERT INTO NOTAS "
                    + "(ID_NOTA, "
                    + "NOTA_1, "
                    + "NOTA_2, "
                    + "NOTA_3, "
                    + "ID_CURSO, "
                    + "ID_ESTUDIANTE) "
                    + "VALUES "
                    + "(NULL ," + notas.getNota1()+ ", " + notas.getNota2()+ ", " + notas.getNota3() + ", " + notas.getIdCursos().getIdCursos()+ ", " + notas.getIdEstudiante().getIdEstudiante()+ "); ";
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
