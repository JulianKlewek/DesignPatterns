package Decorator;

public abstract class GunAccessory implements Gun {

    private Gun gun;

    public GunAccessory(Gun gun) {
        this.gun = gun;
    }

    @Override
    public String addAccessory() {
        return gun.addAccessory();
    }
}
