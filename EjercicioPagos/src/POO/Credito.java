package POO;

public class Credito extends Pago{
 
    private int numeroTdeCredito;
    private String tipo = "MASTERCARD";
    private String fechaDeExp = "02/JUN/2016";
    private String nombre;

    public Credito(int numeroTarjeta,String nombres, double subTotal, double propinas, double impuestos) {
        super(subTotal, propinas, impuestos);
        this.numeroTdeCredito = numeroTarjeta;
        this.nombre = nombres;
    }    

    public boolean hacerCargo(double total){
        if(total > 10000){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    @Override
    public String toString() {
        return "Credito{" + "numeroTdeCredito = " + numeroTdeCredito + "\n" +
               "tipo = " + tipo + "\n" +
               "fechaDeExp = " + fechaDeExp + "\n" + 
               "nombre = " + nombre + "\n" + 
               "PAGO = " + super.toString() + "\n" + 
                '}';
    }
    
    
    
}
