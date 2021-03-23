package State;

public class Doors   {

    private DoorsState currentState;

    public Doors() {
        currentState = new ClosedDoorsState();
    }

    public void setCurrentState(DoorsState state){
        this.currentState = state;
    }

    public DoorsState getCurrentState() {
        return currentState;
    }

}
