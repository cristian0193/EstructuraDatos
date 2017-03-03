package Patron_Clone;

public class Puerta_Embarque {

    private String id;
    protected String hora;
    protected String fecha;
    protected String puerta_enlace;
    public Vuelo vuelo;

   public Puerta_Embarque(String id, String hora, String fecha, String puerta_enlace, Vuelo vuelo) {
        this.id = id;
        this.hora = hora;
        this.fecha = fecha;
        this.puerta_enlace = puerta_enlace;
        this.vuelo = vuelo;
    }   

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

    public String getPuerta_enlace() {
        return puerta_enlace;
    }

    public void setPuerta_enlace(String puerta_enlace) {
        this.puerta_enlace = puerta_enlace;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

}
