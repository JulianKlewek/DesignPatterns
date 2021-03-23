package Decorator;

public class Magazine extends GunAccessory {

    private String model;
    private int capacity;

    public Magazine(Gun gun, String model, int capacity) {
        super(gun);
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String addAccessory() {
        return super.addAccessory() + addMagazine();
    }

    private String addMagazine(){
        return " with " + model + "-(" + capacity + ")capacity";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
