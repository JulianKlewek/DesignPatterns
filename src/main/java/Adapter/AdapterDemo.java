package Adapter;

public class AdapterDemo {

    public static void main(String[] args) {

        Movable car = new BMW518d();
        MovableAdapterImpl carAdapter = new MovableAdapterImpl(car);

        System.out.println("Max speed in mph: " + car.getMaxSpeed());
        System.out.println("Max speed in kmph: " + carAdapter.getMaxSpeed());
    }
}
