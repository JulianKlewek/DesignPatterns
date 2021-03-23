package Decorator;

public class DecoratorDemo {

    public static void main(String[] args) {

        Gun gun1 = new Scope(new GunImpl("M4A1"),1,"Vortex Optics");
        System.out.println(gun1.addAccessory());

        Magazine magazine = new Magazine(gun1,"CYMA PMAG", 32);
        System.out.println(magazine.addAccessory());


    }
}
