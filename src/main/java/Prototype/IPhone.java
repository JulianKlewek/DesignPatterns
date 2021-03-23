package Prototype;

import java.util.Objects;

public class IPhone extends MobilePhone {

    private String iosVersion;

    public IPhone(double weight, double height, double width, String model, String iosVersion) {
        super(weight, height, width, model);
        this.iosVersion = iosVersion;
    }

    public IPhone(IPhone iPhone) {
        super(iPhone);
        if(iPhone != null){
            this.iosVersion = iPhone.iosVersion;
        }
    }

    @Override
    public MobilePhone clone() {
        return new IPhone(this);
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof IPhone) || !super.equals(object)){
            return false;
        }
        IPhone iPhone = (IPhone) object;
        return Objects.equals(iPhone.iosVersion, iosVersion);
    }
}
