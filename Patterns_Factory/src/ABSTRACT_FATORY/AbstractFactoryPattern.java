package ABSTRACT_FATORY;

public class AbstractFactoryPattern {

    public static void main(String[] args) {

        //METODOS CELULARES
        AbstractFactory shapeFactory = FactoryProducer.getFactory("IPHONE");

        Iphone iphone6 = shapeFactory.getIphone("IPHONE 6");

        iphone6.celular();

        Iphone iphone6s = shapeFactory.getIphone("IPHONE 6S");

        iphone6s.celular();

        Iphone iphone7 = shapeFactory.getIphone("IPHONE 7");

        iphone7.celular();

        Iphone iphone7s = shapeFactory.getIphone("IPHONE 7S");

        iphone7s.celular();

        //METODOS COLORES
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color dorado = colorFactory.getColor("DORADO");

        dorado.Cobertura();

        Color plateado = colorFactory.getColor("PLATEADO");

        plateado.Cobertura();

        Color rosado = colorFactory.getColor("ROSADO");

        rosado.Cobertura();

        Color negro = colorFactory.getColor("NEGRO");

        negro.Cobertura();
    }
}
