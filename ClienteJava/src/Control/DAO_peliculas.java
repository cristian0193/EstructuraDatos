package Control;

import Persistencia.transaccionesDB;
import Modelo.Pelicula;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DAO_peliculas {

    public static transaccionesDB conexionDB;
    public static Statement declaracion;
    public static ResultSet resultado;
    public static Pelicula pelicula;
    public static String query;
   
    public static void insertarPelicula(Pelicula pelicula) {

        conexionDB = new transaccionesDB();
        conexionDB.Conectar();
        
        if (pelicula != null) { // se valdia que el objeto no sea null

            query = "INSERT INTO PELICULA (ID_PELICULA,TITULO,CATEGORIA,FORMATO,GENERO,FECHA) VALUES "
                    + "(NULL,"
                    + "'" + pelicula.getTitulo() + "',"
                    + "'" + pelicula.getCategoria() + "',"
                    + "'" + pelicula.getFormato() + "',"
                    + "'" + pelicula.getGenero() + "',"
                    + "'" + pelicula.getFecha() + "')";

            conexionDB.insert(query);
            JOptionPane.showMessageDialog(null, "PELICULA INSERTADA");

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos obligatorios");
        }

    }

    public static void actualizacionPelicula(Pelicula pelicula) {

        if (pelicula != null) { // se valdia que el objeto no sea null

                query = "UPDATE PELICULA SET "
                        + " TITULO = '" + pelicula.getTitulo() + "',"
                        + " CATEGORIA = '" + pelicula.getCategoria() + "',"
                        + " FORMATO = '" + pelicula.getFormato() + "',"
                        + " GENERO = '" + pelicula.getGenero() + "',"
                        + " FECHA = '" + pelicula.getFecha() + "'"
                        + " WHERE "
                        + " ID_PELICULA = '" + pelicula.getId() + "'";

                conexionDB.update(query);
                JOptionPane.showMessageDialog(null, "PELICULA ACTUALIZADA");

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos obligatorios");
        }

    }

    public static void eliminarPelicula(Pelicula pelicula) {

        if (pelicula != null) {

                query = "DELETE FROM PELICULA WHERE ID_PELICULA = '" + pelicula.getId() + "'";
                
                conexionDB.delete(query);
                JOptionPane.showMessageDialog(null, "PELICULA ELIMINADA");

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos obligatorios");
        }

    }

}
