package pilas;

public class nodo {

    public String dato1;
    public String dato2;
    public String dato3;
    public nodo anterior;

    public nodo(String codigo, String nombre, String autor) {

        dato1 = codigo;
        dato2 = nombre;
        dato3 = autor;
        anterior = null;
    }
}
