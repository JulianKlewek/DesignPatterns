package Facade;

public class FacadeDemo {

    public static void main(String[] args) {

        ShapeFacade shapeFacade = new ShapeFacade();

        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();
    }
}
