package AbstractFactory;

public class ColorFactory implements AbstractFactory<Color>{

    public Color create(String color) {
        if("Black".equalsIgnoreCase(color)){
            return new Black();
        }else if("Silver".equalsIgnoreCase(color)){
            return new Silver();
        }else{
            return null;
        }
    }
}
