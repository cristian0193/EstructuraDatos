package Patron_Clone;

import java.util.Hashtable;

public class AvionCache {
 
    private static Hashtable<String, Avion> avionMap  = new Hashtable<String, Avion>();
    
    public static Avion getShape(String avionId) {
      Avion cachedAvion = avionMap.get(avionId);
      return (Avion) cachedAvion.clone();
   }
    
    public static void loadCache() {
      
      Avion_Airbuis_A320 avion_airbus_a320 = new Avion_Airbuis_A320();
      avion_airbus_a320.setId("1");
      avionMap.put(avion_airbus_a320.getId(),avion_airbus_a320);

      Avion_Airbuis_A340 avion_airbus_a340 = new Avion_Airbuis_A340();
      avion_airbus_a340.setId("2");
      avionMap.put(avion_airbus_a340.getId(),avion_airbus_a340);

      Avion_Bieng_747 avion_bieng_a747 = new Avion_Bieng_747();
      avion_bieng_a747.setId("3");
      avionMap.put(avion_bieng_a747.getId(),avion_bieng_a747);
   
      Avion_Bieng_777 avion_bieng_a777 = new Avion_Bieng_777();
      avion_bieng_a777.setId("1");
      avionMap.put(avion_bieng_a777.getId(),avion_bieng_a777);
      
   }
    
}
