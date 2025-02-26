package OCP;

public class Circle extends Shape
{
    private double Radius;
    public Circle(double Radius)
    {

        this.Radius = Radius;

    }
    
    @Override 
    public double calculateArea() {
      return Math.PI * this.Radius * this.Radius;
    }

  }
  