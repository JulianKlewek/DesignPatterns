package State;

public class Person {

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void goIn(Doors doors){
        if(doors.getCurrentState() instanceof ClosedDoorsState){
            System.out.println("You cannot go in because doors are closed.");
        }else{
            System.out.println("You entered");
        }
    }

    public void openDoors(Doors doors){
        if(doors.getCurrentState() instanceof ClosedDoorsState){
        doors.setCurrentState(new OpenedDoorsState());
        }
        System.out.println("Doors are already opened");
    }

    public void closeDoors(Doors doors){
        if(doors.getCurrentState() instanceof OpenedDoorsState){
        doors.setCurrentState(new ClosedDoorsState());
        }
        System.out.println("Doors are already closed");
    }
}
