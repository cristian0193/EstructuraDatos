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

        if (pelicula != null) {

            try {

                conexionDB = new ConexionDB();
                conexion = conexionDB.Conectar();

                query = "INSERT INTO PELICULAS (ID_PELICULA,TITULO,CATEGORIA,FORMATO,GENERO) VALUES "
                        + "('" + pelicula.getId() + "',"
                        + "'" + pelicula.getTitulo() + "',"
                        + "'" + pelicula.getCategoria() + "',"
                        + "'" + pelicula.getFormato() + "',"
                        + "'" + pelicula.getGenero() + "')";

                declaracion = conexion.createStatement();
                declaracion.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "PELICULA INSERTADA");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se permitio la inserción. ERROR : " + ex.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos obligatorios");
        }

    }

    public static void actualizacionPelicula(Pelicula pelicula) {

        if (pelicula != null) {

            try {

                conexionDB = new ConexionDB();
                conexion = conexionDB.Conectar();

                query = "UPDATE PELICULAS SET "
                        + " TITULO = '" + pelicula.getTitulo() + "'"
                        + " WHERE "
                        + " ID_PELICULA = '" + pelicula.getId() + "'";

                declaracion = conexion.createStatement();
                declaracion.executeUpdate(query);

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

                query = "DELETE FROM PELICULAS WHERE ID_PELICULA = '" + pelicula.getId() + "'";

                declaracion = conexion.createStatement();
                declaracion.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "PELICULA ELIMINADA");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se permitio la eliminacion. ERROR : " + ex.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos obligatorios");
        }

    }

    public static void consultarPelicula() {

        try {

            conexionDB = new ConexionDB();
            conexion = conexionDB.Conectar();

            query = "SELECT * FROM PELICULAS";

            declaracion = conexion.createStatement();

            resultado = declaracion.executeQuery(query);

            while (resultado.next()) {

                String idPelicula = resultado.getString("ID_PELICULA");
                String tituloPelicula = resultado.getString("TITULO");
                String categoriaPelicula = resultado.getString("CATEGORIA");
                String formatoPelicula = resultado.getString("FORMATO");
                String generoPelicula = resultado.getString("GENERO");

                consultaPelicula += "\n ID : " + idPelicula + "\n"
                        + "TITULO : " + tituloPelicula + "\n"
                        + "CATEGORIA : " + categoriaPelicula + "\n"
                        + "FORMATO : " + formatoPelicula + "\n"
                        + "GENERO : " + generoPelicula + "\n";

            }

            JOptionPane.showMessageDialog(null, consultaPelicula);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se permitio la eliminacion. ERROR : " + ex.getMessage());
        }

    }

}
