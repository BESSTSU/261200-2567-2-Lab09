package OCP;

public class Ellipse extends Shape
{
    private double Majorlength;
    private double Minorlength;

    public Ellipse(double Majorlength, double Minorlength)
    {
        this.Majorlength = Majorlength;
        this.Minorlength = Minorlength;
    }
    
    @Override
    public double calculateArea()
    {
        return Math.PI * this.Majorlength * this.Minorlength;
    }
}
