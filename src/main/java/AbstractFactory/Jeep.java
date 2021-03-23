package AbstractFactory;

public class Jeep implements Car{
    @Override
    public String getEngine() {
        return "V8";
    }

    @Override
    public double getMaxSpeed() {
        return 220;
    }
}
