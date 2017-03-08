package Vista;

import java.awt.Image;
import javax.swing.ImageIcon;

public class PantallaCargandoMain {

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
    }
}