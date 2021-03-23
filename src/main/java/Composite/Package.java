package Composite;

import java.util.ArrayList;
import java.util.List;

public class Package implements Item {
    public enum Size{
        small,medium,large
    }

    private long id;
    private Size size;
    private List<Item> itemsInPackage;


    public Package(long id, Size size) {
        this.id = id;
        this.size = size;
        this.itemsInPackage = new ArrayList<>();
    }


    public void addItem(Item item){
        itemsInPackage.add(item);
    }

    public void removeItem(Item item){
        itemsInPackage.remove(item);
    }

    public void printItemsInside(){
        System.out.println("Items inside package with id: " + id);
        itemsInPackage.forEach(Item::printItemName);

        itemsInPackage.stream()
                .filter(s -> s instanceof Package)
                .map(item -> (Package) item)
                .forEach(s -> s.printItemsInside());
    }

    @Override
    public String toString() {
        return "Package{" +
                "id=" + id +
                ", size=" + size +
                '}';
    }
}
