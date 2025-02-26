package OCP;

public class Main
{
    public static void main(String[] args)
    {
        AreaCalculator area = new AreaCalculator();
        Circle circle = new Circle(10);
        System.out.println("Area of Circle: " + area.calculateArea(circle));

        Rectangle rectangle = new Rectangle(7, 9);
        System.out.println("Area of Rectangle: " + area.calculateArea(rectangle));

        Ellipse ellipse = new Ellipse(8, 12);
        System.out.println("Area of Ellipse: " + area.calculateArea(ellipse));
    }
}
