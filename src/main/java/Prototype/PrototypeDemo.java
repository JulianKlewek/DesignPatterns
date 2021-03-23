package Prototype;

public class PrototypeDemo {

    public static void main(String[] args) {


        MobilePhone samsung1 = new Samsung(1.2,11.8,6,"S7 Edge", "Android 11");
        MobilePhone samsung2 = samsung1.clone();

        System.out.println("Samsung objects equal? " +  samsung1.equals(samsung2));

        IPhone iPhone1 = new IPhone(1.1, 11, 7, "IPhone X", "iOS 14");
        IPhone iPhone2 = (IPhone) iPhone1.clone();

        System.out.println("IPhone objects equal? " + iPhone1.equals(iPhone2));
    }
}
