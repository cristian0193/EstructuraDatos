package Patron_Clone;

public class Vuelo {

    private String id;
    protected String origen;
    protected String destino;
    protected String hora_salida;
    protected String hora_destino;
    protected String fecha_salida;
    public Pasajero pasajero;

    public Vuelo(String id, String origen, String destino, String hora_salida, String hora_destino, String fecha_salida, Pasajero pasajero) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.hora_salida = hora_salida;
        this.hora_destino = hora_destino;
        this.fecha_salida = fecha_salida;
        this.pasajero = pasajero;
    }

        
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getHora_destino() {
        return hora_destino;
    }

    public void setHora_destino(String hora_destino) {
        this.hora_destino = hora_destino;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

}
