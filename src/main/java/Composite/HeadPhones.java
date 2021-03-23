package Composite;

public class HeadPhones implements Item {

    private long id;
    private String name;
    private boolean wireless;

    public HeadPhones(long id, String name, boolean wireless) {
        this.id = id;
        this.name = name;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "HeadPhones{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", wireless=" + wireless +
                '}';
    }
}
