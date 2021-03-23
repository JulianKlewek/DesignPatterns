package Adapter;

public class MovableAdapterImpl implements MovableAdapter{

    private Movable car;

    public MovableAdapterImpl(Movable car) {
        this.car = car;
    }

    @Override
    public double getMaxSpeed() {
        return convertMPHToKMPH(car.getMaxSpeed());
    }

    private double convertMPHToKMPH(double maxSpeed) {
        return maxSpeed * 1.60934;
    }
}
