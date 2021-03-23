package Singleton;

public final class Singleton {

    private static Singleton INSTANCE;
    private String message = "Singleton instance created";

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
