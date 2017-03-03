package Patron_Clone;

import javax.swing.JOptionPane;

public class PrototypePattern {

    public static void main(String[] args) {

        String mensaje = "";

        AvionCache.loadCache();
        PasajeroCache.loadCache();

        Avion cloneAvion = (Avion) AvionCache.getShape("1");
        Pasajero clonePasajero = (Pasajero) PasajeroCache.getShape("1");

        Aerolinea aerolinea = new Aerolinea("12345", "AVIANCA", "CALI");
        Vuelo vuelo = new Vuelo("VU01", "BOGOTA", "CALI", "5:00 PM", "11:00 PM", "03-MARZO-2017", clonePasajero);
        Puerta_Embarque puerta = new Puerta_Embarque("1", "10:00 AM", "02-MARZO-2017", "AV01", vuelo);
        Aeropuerto aeropuerto = new Aeropuerto("SKCL", "ALFONSO BONILLA ARAGON", "5.590.518", cloneAvion, puerta);

        mensaje = " ----------------------------------------------------------------------- "
                + " AEROPUERTO : " + aeropuerto.getNit()+ ", " + aeropuerto.getNombre()
                + " AEROLINEA : " + aerolinea.getNombre() + ", " + aerolinea.getCiudad()
                + " ----------------------------------------------------------------------- "
                + " PUERTA : " + puerta.getPuerta_enlace() + ""
                + " FECHA : " + puerta.getFecha() + " "
                + " HORA : " + puerta.getHora() + " "
                + " ----------------------------------------------------------------------- "
                + " ORIGEN : " + puerta.getVuelo().getOrigen() + " "
                + " DESTINO : " + puerta.getVuelo().getDestino() + " "
                + " HORA SALIDA : " + puerta.getVuelo().getHora_salida() + " "
                + " HORA DESTINO : " + puerta.getVuelo().getHora_destino() + " "
                + " ----------------------------------------------------------------------- "
                + " IDENTIFICACION : " + clonePasajero.getIdentificacion() + " "
                + " NOMBRE : " + clonePasajero.getNombre() + " " + clonePasajero.getApellido() + " "
                + " ----------------------------------------------------------------------- "
                + " AVION : " + cloneAvion.getNombre() + " "
                + " CAPACIDAD : " + cloneAvion.getCapacidad()+ " "
                + " PESO : " + cloneAvion.getPeso() + " "                
                + " ";
                
        JOptionPane.showMessageDialog(null, mensaje);

//        System.out.println("Tipo Servicio : " + clonedUberX.getType());
//        System.out.println("Conductor : " + clonedUberX.getConductor());
//        System.out.println("Usuario : " + clonedUberX.getUsuario());
//        System.out.println("Localizacion : " + clonedUberX.getLocalizacion());
//        System.out.println("Placa : " + clonedUberX.getPlaca());
//        System.out.println("Valor : " + clonedUberX.getValor());
    }

}
