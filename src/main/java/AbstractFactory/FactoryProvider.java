package AbstractFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String type){
        if("Color".equalsIgnoreCase(type)){
            return new ColorFactory();
        }else if("Car".equalsIgnoreCase(type)){
            return new CarFactory();
        }
        return null;
    }
}
