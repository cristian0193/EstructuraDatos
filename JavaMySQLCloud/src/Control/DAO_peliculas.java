package Control;

import Conexion.ConexionDB;
import Modelo.Pelicula;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DAO_peliculas {

    public static ConexionDB conexionDB;
    public static Connection conexion;
    public static Statement declaracion;
    public static ResultSet resultado;
    public static Pelicula pelicula;
    public static String query,consultaPelicula = "";

    public static void insertarPelicula(Pelicula pelicula) {

        if (pelicula != null) { // se valdia que el objeto no sea null

            try {

                conexionDB = new ConexionDB();
                conexion = conexionDB.Conectar(); // se realiza la conexion a la base de datos

                    query = "INSERT INTO PELICULA (ID_PELICULA,TITULO,CATEGORIA,FORMATO,GENERO) VALUES "
                        + "(NULL,"
                        + "'" + pelicula.getTitulo() + "',"
                        + "'" + pelicula.getCategoria() + "',"
                        + "'" + pelicula.getFormato() + "',"
                        + "'" + pelicula.getGenero() + "')";

                declaracion = conexion.createStatement(); // se prepara el espacio en memoria para ejecutar el query
                declaracion.executeUpdate(query); // se ejecuta la consulta.

                JOptionPane.showMessageDialog(null, "PELICULA INSERTADA");                
            } catch (SQLException ex) { // se dispara esta excepcion si el query realizado tiene problema de sintaxis.
                JOptionPane.showMessageDialog(null, "No se permitio la inserción. ERROR : " + ex.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos obligatorios");
        }

    }

    public static void actualizacionPelicula(Pelicula pelicula) {

        if (pelicula != null) { // se valdia que el objeto no sea null

            try {

                conexionDB = new ConexionDB();
                conexion = conexionDB.Conectar(); // se realiza la conexion a la base de datos

                query = "UPDATE PELICULA SET "
                        + " TITULO = '" + pelicula.getTitulo() + "',"
                        + " CATEGORIA = '" + pelicula.getCategoria() + "',"
                        + " FORMATO = '" + pelicula.getFormato() + "',"
                        + " GENERO = '" + pelicula.getGenero() + "'"
                        + " WHERE "
                        + " ID_PELICULA = '" + pelicula.getId() + "'";

                declaracion = conexion.createStatement();  // se prepara el espacio en memoria para ejecutar el query
                declaracion.executeUpdate(query); // se ejecuta la consulta.

                JOptionPane.showMessageDialog(null, "PELICULA ACTUALIZADA");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se permitio la actualizacion. ERROR : " + ex.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos obligatorios");
        }

    }

    public static void eliminarPelicula(Pelicula pelicula) {

        if (pelicula != null) {

            try {

                conexionDB = new ConexionDB();
                conexion = conexionDB.Conectar();

                query = "DELETE FROM PELICULA WHERE ID_PELICULA = '" + pelicula.getId() + "'";

                declaracion = conexion.createStatement(); // se prepara el espacio en memoria para ejecutar el query
                declaracion.executeUpdate(query); // se ejecuta la consulta.

                JOptionPane.showMessageDialog(null, "PELICULA ELIMINADA");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se permitio la eliminacion. ERROR : " + ex.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos obligatorios");
        }

    }


}
