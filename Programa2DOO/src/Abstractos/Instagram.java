package Abstractos;
/**
 *
 * @author Christian Rodriguez
 */
public class Instagram extends RedSocial{

    public Instagram(String nombre_Red, String URL, String fundador, String tipologia) {
        super(nombre_Red, URL, fundador, tipologia);
    }

    @Override
    public String Compatir() {
        return "COMPARTIENDO DESDE INSTAGRAM ....";
    }

    @Override
    public String Navegar() {
        return "NAVEGANDO DESDE INSTAGRAM ....";
    }

    @Override
    public String Buscar() {
        return "BUSCANDO DESDE INSTAGRAM ....";
    }
    
}
