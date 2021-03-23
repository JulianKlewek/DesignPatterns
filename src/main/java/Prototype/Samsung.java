package Prototype;

import java.util.Objects;

public class Samsung extends MobilePhone {

    private String androidVersion;


    public Samsung(double weight, double height, double width, String model, String androidVersion) {
        super(weight, height, width, model);
        this.androidVersion = androidVersion;
    }

    public Samsung(Samsung samsung) {
        super(samsung);
        if(samsung != null){
            this.androidVersion = samsung.androidVersion;
        }
    }

    @Override
    public MobilePhone clone() {
     return new Samsung(this);
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof Samsung) || !super.equals(object)){
            return false;
        }
        Samsung samsung = (Samsung) object;
        return Objects.equals(samsung.androidVersion, androidVersion);
    }
}
