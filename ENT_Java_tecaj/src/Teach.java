import java.util.ArrayList;
import java.util.Collections;

public class Teach {

    ArrayList<GeometricFigure> figures = new ArrayList<>();

    public void addFigure(GeometricFigure figure){
        figures.add(figure);
    }

    public void pintAll(){
        for(GeometricFigure figure : figures){
            System.out.println(figure);
        }
    }

    public void sortBySurface(){
        Collections.sort(figures);
    }
}
