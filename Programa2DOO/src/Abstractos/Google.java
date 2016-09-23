/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractos;

/**
 *
 * @author Christian Rodriguez
 */
public class Google extends RedSocial{

    public Google(String nombre_Red, String URL, String fundador, String tipologia) {
        super(nombre_Red, URL, fundador, tipologia);
    }

   @Override
    public String Compatir() {
        return "COMPARTIENDO DESDE GOOGLE+ ....";
    }

    @Override
    public String Navegar() {
        return "NAVEGANDO DESDE GOOGLE+ ....";
    }

    @Override
    public String Buscar() {
        return "BUSCANDO DESDE GOOGLE+ ....";
    }
    
}
