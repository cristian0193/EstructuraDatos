package Patron_Clone;

public class Aerolinea {

    public String nit;
    public String nombre;
    public String ciudad;

    public Aerolinea(String nit, String nombre, String ciudad) {
        this.nit = nit;
        this.nombre = nombre;
        this.ciudad = ciudad;
    } 
    
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
