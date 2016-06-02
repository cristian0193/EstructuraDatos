package POO;

public class Debito extends Pago{
   
    private int numeroCuenta;
    private String tipoCuenta = "AHORRO";
    private String nombre;

    public Debito(int numeroCuentas,String nombres, double subTotal, double propinas, double impuestos) {
        super(subTotal, propinas, impuestos);
        this.numeroCuenta = numeroCuentas;
        this.nombre = nombres;
    }

    @Override
    public String toString() {
        return "Debito{" + "numeroCuenta = " + numeroCuenta + "\n" +
               "tipoCuenta = " + tipoCuenta + "\n" +
               "nombre = " + nombre + "\n" +
               "PAGO = " + super.toString() + "\n" + 
               '}';
    }          
    
}
