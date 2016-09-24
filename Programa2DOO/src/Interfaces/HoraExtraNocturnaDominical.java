package Interfaces;

public class HoraExtraNocturnaDominical implements PagoHoraExtra{

    final static double PORCENTAJE_HORA = 2.5;
    double cantidad;
    double valorHora;

    public HoraExtraNocturnaDominical(double cantidad,double ValorHora) {
        this.cantidad = cantidad;
        this.valorHora = ValorHora;
    }        
    
    @Override
    public double getHoraExtra() {        
        return Redondear((valorHora*PORCENTAJE_HORA)*cantidad);
    }
    
    public double Redondear(double numero) {
        return Math.rint(numero * 1) / 1;
    }
    
    
}
