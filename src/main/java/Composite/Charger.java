package Composite;

public class Charger implements Item {

    private String model;
    private double outputVoltage;
    private double outputCurrent;

    public Charger(String model, double outputVoltage, double outputCurrent) {
        this.model = model;
        this.outputVoltage = outputVoltage;
        this.outputCurrent = outputCurrent;
    }

    @Override
    public String toString() {
        return "Charger{" +
                "model='" + model + '\'' +
                ", outputVoltage=" + outputVoltage +
                ", outputCurrent=" + outputCurrent +
                '}';
    }
}
