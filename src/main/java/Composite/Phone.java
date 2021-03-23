package Composite;

public class Phone implements Item{

    private String model;
    private long id;

    public Phone(String model, long id) {
        this.model = model;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", id=" + id +
                '}';
    }
}
