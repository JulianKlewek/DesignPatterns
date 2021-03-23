package Singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1.getMessage());
        System.out.println(singleton2.getMessage());

        singleton1.setMessage("new message");

        System.out.println(singleton1.getMessage());
        System.out.println(singleton2.getMessage());

    }
}
