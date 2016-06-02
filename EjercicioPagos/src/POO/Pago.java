package POO;

public class Pago {

    private double subTotal;
    private double propinas;
    private double impuestos;

    public Pago(double subTotal, double propinas, double impuestos) {
        this.subTotal = subTotal;
        this.propinas = propinas;
        this.impuestos = impuestos;
    }

    public double calculoTotal(double subTotal, double propina, double impuestos ){
        double total = 0;
        total = subTotal + propina + impuestos;        
        return total;
    }
    
    
    @Override
    public String toString() {
        return "Pago{" + "subTotal=" + subTotal + ", propinas=" + propinas + ", impuestos=" + impuestos + '}';
    }
    
    
    
}
