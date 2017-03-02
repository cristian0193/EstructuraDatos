package Patron_Clone;

public class Aeropuerto {

    public void Aeropuerto(){        
    }
    
    public String nit;
    public String nombre;
    public String capacidad;
    public Avion avion = new Avion(){};
    public Puerta_Embarque puerta = new Puerta_Embarque();        

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

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Puerta_Embarque getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta_Embarque puerta) {
        this.puerta = puerta;
    }
        
    
}
