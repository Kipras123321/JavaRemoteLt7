package advanced.Interface.Example1;

import java.awt.*;

public class InterfaceExampleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 3);
        System.out.println(rectangle.getArea());
        rectangle.printShape();

        Square square = new Square(2);
        System.out.println(square.getPerimeter());
        square.printShape();


    }
}
