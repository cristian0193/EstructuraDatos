package Abstractos;
/**
 *
 * @author Christian Rodriguez
 */
public class YouTube extends RedSocial{

    public YouTube(String nombre_Red, String URL, String fundador, String tipologia) {
        super(nombre_Red, URL, fundador, tipologia);
    }

   @Override
    public String Compatir() {
        return "COMPARTIENDO DESDE YOUTUBE ....";
    }

    @Override
    public String Navegar() {
        return "NAVEGANDO DESDE YOUTUBE ....";
    }

    @Override
    public String Buscar() {
        return "BUSCANDO DESDE YOTUBE ....";
    }
    
}
