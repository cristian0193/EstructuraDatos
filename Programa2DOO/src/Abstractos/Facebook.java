package Abstractos;
/**
 *
 * @author Christian Rodriguez
 */
public class Facebook extends RedSocial{

    public Facebook(String nombre_Red, String URL, String fundador, String tipologia) {
        super(nombre_Red, URL, fundador, tipologia);
    }

    @Override
    public String Compatir() {
        return "COMPARTIENDO DESDE FACEBOOK ....";
    }

    @Override
    public String Navegar() {
        return "NAVEGANDO DESDE FACEBOOK ....";
    }

    @Override
    public String Buscar() {
        return "BUSCANDO DESDE FACEBOOK ....";
    }
    
}
