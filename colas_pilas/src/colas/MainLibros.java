package colas;

import javax.swing.JOptionPane;

public class MainLibros {

    public static void main(String[] args) {

        colasLibros clibros = new colasLibros();
        String codigo, nombre, autor;
        int opc = 0;
        String mensaje = "Menu Libros\n\n"
                + " 1. Incluir un nodo\n"
                + " 2. Mostrar datos de la cola\n"
                + " 3. Mostrar Ultimo nodo\n"
                + " 4. Eliminar nodo\n"
                + " 5. Numero de datos en la cola\n"
                + " 6. Salir";

        while (opc != 6) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            switch (opc) {
                case 1:
                    codigo = JOptionPane.showInputDialog("Digite el codigo del libro");
                    nombre = JOptionPane.showInputDialog("Digite el nombre del libro");
                    autor = JOptionPane.showInputDialog("Digite el autor del libro " + nombre);
                    clibros.incluir_nodo(codigo, nombre, autor);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, clibros.listar_cola());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, clibros.mostrar_Ultimo_nodo());
                    break;
                case 4:
                    clibros.eliminar_nodo();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, clibros.Cantidad_de_nodos());
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "digite nuevamente");
                    break;
            }
        }
    }
}
