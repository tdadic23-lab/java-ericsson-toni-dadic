public class Circle extends GeometricFigure{

    private final double r;

    public Circle(double r) {
        super("Circle");
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double surface() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * r;
    }

    @Override
    public String toString() {
        return "Circle(r=" + r + ")";
    }
}
