package Patron_Clone;

public class Puerta_Embarque {

    public Puerta_Embarque() {
    }

    private String id;
    protected String hora;
    protected String fecha;
    protected double puerta_enlace;
    public Vuelo vuelo = new Vuelo();
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPuerta_enlace() {
        return puerta_enlace;
    }

    public void setPuerta_enlace(double puerta_enlace) {
        this.puerta_enlace = puerta_enlace;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    

}
