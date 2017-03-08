package Vista;

import Conexion.ConexioSQLite;
import java.awt.Image;
import java.sql.Connection;
import javax.swing.ImageIcon;

public class PantallaCargandoMain {

    public static ConexioSQLite conexion;
    PantallaCargando screen;

    public PantallaCargandoMain() {
        inicioPantalla();
        screen.velocidadDeCarga();
        
    }

    private void inicioPantalla() {
        ImageIcon myImage = new ImageIcon("src\\Imagen\\java.gif");
        screen = new PantallaCargando(myImage);
        screen.setLocationRelativeTo(null);
        screen.setProgresoMax(100);
        screen.setVisible(true);
    }

    public static void main(String[] args) {
        new PantallaCargandoMain();

        Menu menu = new Menu();
        menu.setVisible(true);
        conexion = new ConexioSQLite();
        conexion.coneccionbase();
        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();
    }
}
