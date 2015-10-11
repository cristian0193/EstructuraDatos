package PilasColasObjectos;


public class Clientes {

    /**
     * Esta clase representa el nodo definida
     *
     * @author Christian A. Rodriguez
     * @version 1.0
     * @since 24Sep2015
     */
    
    private int identificacionCliente;
    private String nombreCliente;
    public String EstadoEspecial;
   
    /**
     * Constructor del Cliente
     * @param identificacionEstudiante
     * @param nombreEstudiante
     * @param EstadoEspecial
     */
     public Clientes(int identificacionEstudiante, String nombreEstudiante,String EstadoEspecial) {
        this.identificacionCliente = identificacionEstudiante;
        this.nombreCliente = nombreEstudiante;
        this.EstadoEspecial = EstadoEspecial;
    }
    
    /**
     * Método para consultar o recuperar el identificacion del Cliente
     * @return identificacion 
     */
    public int getIdentificacionCliente() {
        return identificacionCliente;
    }

    /**
     * Método para asignar el identificacion del Cliente
     * @param identificacionCliente  identificacion de estudiante
     */
    public void setIdentificacionCliente(int identificacionCliente) {
        this.identificacionCliente = identificacionCliente;
    }

    /**
     * Método para consultar o recuperar el Datos de Cliente
     * @return Estudiante 
     */
     public String getNombreEstudiante() {
        return nombreCliente;
    }
       
    /**
     * Método para asignar los datos del Cliente
     * @param nombreCliente  Datos de Cliente
     */
     public void setNombreEstudiante(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEstadoEspecial() {
        return EstadoEspecial;
    }

    public void setEstadoEspecial(String EstadoEspecial) {
        this.EstadoEspecial = EstadoEspecial;
    }
         
          
     
    @Override
   public String toString() {
      return "Cliente{\n" +
             "Identificacion Cliente = " + identificacionCliente + "\n" +
             "Nombre Ciente = " + nombreCliente + "\n" +
             "Estado Cliente Especial " +  EstadoEspecial + "\n" +
             "}";
   }

}
