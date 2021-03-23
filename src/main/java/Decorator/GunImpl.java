package Decorator;

public class GunImpl implements Gun {

    private String model;

    public GunImpl(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String addAccessory() {
        return model ;
    }
}
