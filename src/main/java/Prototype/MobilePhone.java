package Prototype;

import java.util.Objects;

public abstract class MobilePhone {

    private double weight;
    private double height;
    private double width;
    private String model;

    public MobilePhone(double weight, double height, double width, String model) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.model = model;
    }

    public MobilePhone(MobilePhone target) {
        if(target != null){
            this.weight = target.weight;
            this.height = target.height;
            this.width = target.width;
            this.model = target.model;
        }
    }

    public abstract MobilePhone clone();

    @Override
    public boolean equals(Object object){
        if(!(object instanceof MobilePhone)){
            return false;
        }
        MobilePhone mobilePhone = (MobilePhone) object;
        boolean result = mobilePhone.height == height && mobilePhone.width == width && mobilePhone.weight == weight && Objects.equals(mobilePhone.model, model);
        return result;
    }

}
