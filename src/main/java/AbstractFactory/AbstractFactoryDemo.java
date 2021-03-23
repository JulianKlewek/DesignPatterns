package AbstractFactory;

import java.util.Scanner;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        System.out.println("Podaj typ obiektu który chcesz stworzyć: car czy color");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        AbstractFactory factory = FactoryProvider.getFactory(type);
        System.out.println("A teraz proszę podać konkretny obiekt który chcesz stworzyć");
        String concreteType = scanner.nextLine();
        Object o = factory.create(concreteType);
        System.out.println(o.getClass());
    }

}
