public class Triangle extends GeometricFigure{

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        super("Triangle");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double surface() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));

    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
/*
    @Override
    public String toString() {
        return "Triangle(a=" + a + ", b=" + b + ", c=" + c + ")";
    }*/
}
