public abstract class GeometricFigure {

    private final String type;

    protected GeometricFigure(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract double surface();
    public abstract double perimeter();

}
