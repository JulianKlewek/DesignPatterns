package State;

public class StateDemo {

    public static void main(String[] args) {

        Doors doors = new Doors();
        Person person = new Person("Jan", "Kowalski");

        person.goIn(doors);
        person.openDoors(doors);
        person.goIn(doors);
        person.closeDoors(doors);
        person.goIn(doors);

    }
}
