package Decorator;

public class Scope extends GunAccessory {

    private long id;
    private String model;

    public Scope(Gun gun, long id, String model) {
        super(gun);
        this.id = id;
        this.model = model;
    }

    @Override
    public String addAccessory() {
        return super.addAccessory() + addScope();
    }

    private String addScope(){
        return " with " + model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
