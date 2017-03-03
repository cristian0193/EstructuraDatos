package Patron_Clone;

import javax.swing.JOptionPane;

public class PrototypePattern {

    public static void main(String[] args) {

        String mensaje = "", menu = "";
        int opcionMenu = 0;

        AvionCache.loadCache();
        PasajeroCache.loadCache();

        do {

            menu = "1. Consultar Tiquete \n 2. Salir ";
            opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcionMenu == 1) {

                int opcionAvion = 0;
                int opcionPasajero = 0;

                do {
                    opcionAvion = Integer.parseInt(JOptionPane.showInputDialog("INGRESE ID DEL AVION"));
                } while (opcionAvion > 4);

                do {
                    opcionPasajero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE ID DEL PASAJERO"));
                } while (opcionPasajero > 3);

                int random = 0;

                random = (int) (Math.random() * 6 + 1);

                Avion cloneAvion = (Avion) AvionCache.getShape("" + opcionAvion);
                Pasajero clonePasajero = (Pasajero) PasajeroCache.getShape("" + opcionPasajero);

                Aerolinea aerolinea = new Aerolinea("12345", "AVIANCA", "CALI");
                Vuelo vuelo = new Vuelo("VU0" + random, "BOGOTA", "CALI", "5:00 PM", "11:00 PM", "03-MARZO-2017", clonePasajero);
                Puerta_Embarque puerta = new Puerta_Embarque("1", "10:00 AM", "02-MARZO-2017", "PUERTA " + random, vuelo);
                Aeropuerto aeropuerto = new Aeropuerto("SKCL", "ALFONSO BONILLA ARAGON", "5.590.518", cloneAvion, puerta);

                mensaje = " ----------------------------------------------------------------------- \n"
                        + " TIQUETE AEROPUERTO LOS PATRONES                                         \n"
                        + " ----------------------------------------------------------------------- \n"
                        + " AEROPUERTO : " + aeropuerto.getNit() + ", " + aeropuerto.getNombre() + "\n"
                        + " AEROLINEA : " + aerolinea.getNombre() + ", " + aerolinea.getCiudad() + "\n"
                        + " ----------------------------------------------------------------------- \n"
                        + " PUERTA : " + puerta.getPuerta_enlace() + "\n"
                        + " FECHA : " + puerta.getFecha() + "\n"
                        + " HORA : " + puerta.getHora() + "\n"
                        + " ----------------------------------------------------------------------- \n"
                        + " ORIGEN : " + puerta.getVuelo().getOrigen() + "\n"
                        + " DESTINO : " + puerta.getVuelo().getDestino() + "\n"
                        + " HORA SALIDA : " + puerta.getVuelo().getHora_salida() + "\n"
                        + " HORA DESTINO : " + puerta.getVuelo().getHora_destino() + "\n"
                        + " ----------------------------------------------------------------------- \n"
                        + " IDENTIFICACION : " + clonePasajero.getIdentificacion() + "\n"
                        + " NOMBRE : " + clonePasajero.getNombre() + " " + clonePasajero.getApellido() + "\n"
                        + " ----------------------------------------------------------------------- \n"
                        + " AVION : " + cloneAvion.getNombre() + "\n"
                        + " CAPACIDAD : " + cloneAvion.getCapacidad() + "\n"
                        + " PESO : " + cloneAvion.getPeso() + "\n"
                        + " ----------------------------------------------------------------------- \n";

                JOptionPane.showMessageDialog(null, mensaje);
            } else if (opcionMenu == 2) {
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Opcion NO valida");
            }

        } while (opcionMenu < 3);

    }

}
