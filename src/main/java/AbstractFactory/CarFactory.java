package AbstractFactory;

public class CarFactory implements AbstractFactory<Car> {

    @Override
    public Car create(String carType) {
        if("Jeep".equalsIgnoreCase(carType)){
            return new Jeep();
        }else if("RacingCar".equalsIgnoreCase(carType)){
            return new RacingCar();
        }else{
            return null;
        }
    }
}
