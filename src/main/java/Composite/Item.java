package Composite;

public interface Item {

    default void printItemName(){
        System.out.println("- " + toString());
    }
}
