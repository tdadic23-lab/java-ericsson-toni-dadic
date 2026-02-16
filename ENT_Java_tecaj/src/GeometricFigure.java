import java.util.ArrayList;

public abstract class GeometricFigure implements Comparable<GeometricFigure>{

    private final String type;

    protected GeometricFigure(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract double surface();
    public abstract double perimeter();

    @Override
    public String toString() {
        return String.format("%s [površina=%.2f, opseg=%.2f]", type, surface(), perimeter());
    }

    @Override
    public int compareTo(GeometricFigure other) {
        return Double.compare(this.surface(), other.surface());
    }
}
