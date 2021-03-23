package AbstractFactory;

public class RacingCar implements Car{
    @Override
    public String getEngine() {
        return "V12";
    }

    @Override
    public double getMaxSpeed() {
        return 260;
    }
}
