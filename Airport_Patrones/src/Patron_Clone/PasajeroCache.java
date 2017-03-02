package Patron_Clone;

import java.util.Hashtable;

public class PasajeroCache {
 
    private static Hashtable<String, Pasajero> pasajeroMap  = new Hashtable<String, Pasajero>();
    
    public static Pasajero getShape(String pasajeroId) {
      Pasajero cachedPasajero = pasajeroMap.get(pasajeroId);
      return (Pasajero) cachedPasajero.clone();
   }
    
    public static void loadCache() {
      
      P_Clase_Economica clase_economica = new P_Clase_Economica();
      clase_economica.setIdentificacion("1");
      pasajeroMap.put(clase_economica.getIdentificacion(),clase_economica);

      P_Clase_Media clase_media = new P_Clase_Media();
      clase_media.setIdentificacion("2");
      pasajeroMap.put(clase_media.getIdentificacion(),clase_media);

      P_Primera_Clase clase_alta = new P_Primera_Clase();
      clase_alta.setIdentificacion("3");
      pasajeroMap.put(clase_alta.getIdentificacion(),clase_alta);  
      
   }
    
}
