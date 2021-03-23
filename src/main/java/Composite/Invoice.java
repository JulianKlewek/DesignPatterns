package Composite;

public class Invoice implements Item {

    private int number;

    public Invoice(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "number=" + number +
                '}';
    }
}
