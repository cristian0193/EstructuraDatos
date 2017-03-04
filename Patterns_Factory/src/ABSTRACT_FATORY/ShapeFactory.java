package ABSTRACT_FATORY;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Iphone getIphone(String iphoneType) {

        if (iphoneType == null) {
            return null;
        }

        if (iphoneType.equalsIgnoreCase("IPHONE 6")) {
            return new Iphone_6();

        } else if (iphoneType.equalsIgnoreCase("IPHONE 6s")) {
            return new Iphone_6s();

        } else if (iphoneType.equalsIgnoreCase("IPHONE 7")) {
            return new Iphone_7();

        } else if (iphoneType.equalsIgnoreCase("IPHONE 7s")) {
            return new Iphone_7s();            
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
