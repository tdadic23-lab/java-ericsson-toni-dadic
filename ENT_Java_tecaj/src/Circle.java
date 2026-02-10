public class Circle {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public String toString(){
        return String.valueOf(r);
    }
}
