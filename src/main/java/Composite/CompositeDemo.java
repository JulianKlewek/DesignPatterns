package Composite;

public class CompositeDemo {

    public static void main(String[] args){

        Package package1 = new Package(1, Package.Size.large);
        Package package2 = new Package(2, Package.Size.medium);
        Package package3 = new Package(3, Package.Size.small);
        Item invoice1 = new Invoice(1);
        Item headphones1 = new HeadPhones(1, "Headphones",true);
        Item phone1 = new Phone("S7", 1);
        Item charger1 = new Charger("DAs1",12,4.5);

        package1.addItem(invoice1);
        package1.addItem(package2);
        package1.addItem(package3);

        package2.addItem(headphones1);
        package2.addItem(phone1);

        package3.addItem(charger1);

        package1.printItemsInside();
    }
}
