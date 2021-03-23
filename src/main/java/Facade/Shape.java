package Facade;

public interface Shape {

    default void draw(){
            System.out.println(this.getClass().getSimpleName());
    }
}
