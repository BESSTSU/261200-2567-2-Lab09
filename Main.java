import DIP.*;
import LSP.*;
import OCP.*;

public class Main {
    public static void main(String[] args){
        // Run OCP Program
        AreaCalculator area = new AreaCalculator();
        Circle circle = new Circle(8);
        System.out.println("Area of Circle: " + area.calculateArea(circle));

        Rectangle rectangle = new Rectangle(2, 7);
        System.out.println("Area of Rectangle: " + area.calculateArea(rectangle));

        Ellipse ellipse = new Ellipse(3, 6);
        System.out.println("Area of Ellipse: " + area.calculateArea(ellipse));
        
        System.out.println();

        // RUN LSP Program
        Penguin penguin = new Penguin();
        penguin.move();
        
        Ostrich ostrich = new Ostrich();
        ostrich.move();
        
        Sparrow juad = new Sparrow();
        juad.fly();
        juad.move();
        
        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.move();

        System.out.println();

        // RUN DIP Program
        OrderProcessor emailOrder = new OrderProcessor(new EmailNotic());
        emailOrder.processOrder(new Order());

        OrderProcessor smsOrder = new OrderProcessor(new SMSNotic());
        smsOrder.processOrder(new Order());

    }
}
