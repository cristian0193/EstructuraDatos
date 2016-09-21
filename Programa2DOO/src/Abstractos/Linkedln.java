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
public class Linkedln extends RedSocial{

    public Linkedln(String nombre_Red, String URL, String fundador, String tipologia) {
        super(nombre_Red, URL, fundador, tipologia);
    }

    @Override
    public String Compatir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Navegar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
