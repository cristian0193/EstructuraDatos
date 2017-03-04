package ABSTRACT_FATORY;

public class ColorFactory extends AbstractFactory {
	
   @Override
   public Iphone getIphone(String shapeType){
      return null;
   }
   
   @Override
   Color getColor(String color) {
   
      if(color == null){
         return null;
      }		
      
      if(color.equalsIgnoreCase("DORADO")){
         return new Color_Dorado();
         
      }else if(color.equalsIgnoreCase("PLATEADO")){
         return new Color_Plateado();
         
      }else if(color.equalsIgnoreCase("ROSADO")){
         return new Color_Rosado();
      
      }else if(color.equalsIgnoreCase("NEGRO")){
         return new Color_Negro();
      }
      
      return null;
   }
}
