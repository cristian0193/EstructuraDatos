package POO;

public class Ejecutar {
    
    public static void main(String[] args) {
        
    Credito credito;
    Debito debito;
    Efectivo efectivo;
    Pago pago;
    
//    pago = new Pago(3500, 50, 100);
//    credito = new Credito(1234,"CRISTIAN",350, 50, 50);
//    debito = new Debito(9876,"CRISTIAN",500, 50, 100);
//    efectivo = new Efectivo(10000,350, 50, 50);
    
        Pago objPago[] = new Pago[2];
        
        objPago[0] = new Credito(1234,"CRISTIAN",350, 50, 50);
        objPago[1] = new Debito(9876,"CRISTIAN",500, 50, 100);
        objPago[2] = new Efectivo(10000,350, 50, 50);
        
       Pago objtransferencia = new Pago(0,0,0);
    
    }
    
    public String realizarTranferencia (Pago pago, double total){                        
        return pago.toString() + " " + total;        
    }
    
    
}
