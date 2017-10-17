package Vista;

import Control.DAO_peliculas;
import Modelo.Pelicula;
import javax.swing.JOptionPane;

public class Ejercicio_15 {

    public static String menu, mensaje = "", id = "", titulo = "", categoria = "", formato = "", genero = "";
    public static int seleccion;
    public static Pelicula pelicula;
    public static Ejercicio_15 ejercicio;
    public static DAO_peliculas daoPeliculas;

    public static void main(String[] args) {

        daoPeliculas = new DAO_peliculas();
        
        do {
            seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu()));

            switch (seleccion) {
                case 1:

                    id = JOptionPane.showInputDialog("Ingrese ID");
                    titulo = JOptionPane.showInputDialog("Ingrese Titulo");
                    categoria = JOptionPane.showInputDialog("Ingrese Categoria");
                    formato = JOptionPane.showInputDialog("Ingrese Formato");
                    genero = JOptionPane.showInputDialog("Ingrese Genero");

                    pelicula = new Pelicula(id, titulo, categoria, formato, genero);

                    daoPeliculas.insertarPelicula(pelicula);

                    break;
                case 2:

                    id = JOptionPane.showInputDialog("Ingrese ID de la pelicula actualizar");
                    titulo = JOptionPane.showInputDialog("Ingrese Nuevo Titulo");

                    pelicula = new Pelicula(id, titulo, categoria, formato, genero);

                    daoPeliculas.actualizacionPelicula(pelicula);

                    break;
                case 3:
                    
                    id = JOptionPane.showInputDialog("Ingrese ID de la pelicula que desea Eliminar");                    

                    pelicula = new Pelicula(id, titulo, categoria, formato, genero);

                    daoPeliculas.eliminarPelicula(pelicula);
                    
                    break;
                case 4:
                    
                    daoPeliculas.consultarPelicula();
                    
                    break;
                default:                    
                    break;
            }

        } while (seleccion != 0);

    }

    public static String menu() {

        menu = " 1 - Ingresar una Pelicula \n"
                + " 2 - Actualizar una Pelicula \n"
                + " 3 - Eliminar una Pelicula \n"
                + " 4 - Consultar Peliculas \n"
                + " 0 - Salir ";
        return menu;
    }
    
}
