package Interfaces;

/**
 *
 * @author Usuario
 */
public class Empleados {

      
    PagoHoraExtra pagoHora;
    String Nombre;
    String Cargo;
    Double Salario;
    
    public Empleados(PagoHoraExtra pagoHora, String Nombre, String Cargo) {
        this.pagoHora = pagoHora;
        this.Nombre = Nombre;
        this.Cargo = Cargo;
    }
    
        public PagoHoraExtra getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(PagoHoraExtra pagoHora) {
        this.pagoHora = pagoHora;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }    
    
    public void display() {
        System.out.println("Name : " + Nombre);
        System.out.println("Cargo : " + Cargo);
        System.out.println("Hora Extra : " + pagoHora.getHoraExtra());
    }
    
}
