import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        Teach teach = new Teach();
        teach.addFigure(new Circle(5));
        teach.addFigure(new Circle(10));
        teach.addFigure(new Triangle(2,3,4));
        teach.addFigure(new Triangle(7,8,9));
        teach.addFigure(new Rectangle(4,6));
        teach.addFigure(new Rectangle(10,12));

        System.out.println("Figures before sorting: ");
        teach.pintAll();

        teach.sortBySurface();

        System.out.println("Figures sorted by surface: ");
        teach.pintAll();
    }
}


