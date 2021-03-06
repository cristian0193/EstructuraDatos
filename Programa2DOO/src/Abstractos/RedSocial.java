package Abstractos;
/**
 *
 * @author Christian Rodriguez
 */
public abstract class RedSocial {

    String nombre_Red;
    String URL;
    String fundador;
    String precio;

    public RedSocial(String nombre_Red, String URL, String fundador, String precio) {
        this.nombre_Red = nombre_Red;
        this.URL = URL;
        this.fundador = fundador;
        this.precio = precio;
    }

    public String getNombre_Red() {
        return nombre_Red;
    }

    public void setNombre_Red(String nombre_Red) {
        this.nombre_Red = nombre_Red;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getFundador() {
        return fundador;
    }

    public void setFundador(String fundador) {
        this.fundador = fundador;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "RedSocial : " +"\n"+ " nombre_Red=" + nombre_Red + "\n URL=" + URL + "\n fundador=" + fundador + "\n precio=" + precio;
    }
    
    public abstract String Compatir();
    public abstract String Navegar();
    public abstract String Buscar();
    

}
