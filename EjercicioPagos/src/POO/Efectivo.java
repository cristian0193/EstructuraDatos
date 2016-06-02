package POO;

public class Efectivo extends Pago{
    
    private double cantidad;

    public Efectivo(double cantidad,double subTotal, double propinas, double impuestos) {
        super(subTotal, propinas, impuestos);
        this.cantidad = cantidad;
    }   
        
    @Override
    public String toString() {
        return "Efectivo{" + 
                "cantidad = " + cantidad + 
                "PAGO = " + super.toString() + 
                '}';
    }
    
    
    
}
