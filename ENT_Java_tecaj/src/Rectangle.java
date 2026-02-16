public class Rectangle extends GeometricFigure{

    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        super("Rectangle");
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double surface() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return ((2*a) + (2*b));
    }
}
