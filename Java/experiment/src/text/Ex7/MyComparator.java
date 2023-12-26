package text.Ex7;

import java.util.Comparator;

public class MyComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        if (o1.name().equals("Circle") && o2.name().equals("Circle")) {
            if (o1.area() < o2.area())
                return -1;
            else if (o1.area() == o2.area())
                return 0;
            else
                return 1;
        } else if (! o1.name().equals("Circle") && ! o2.name().equals("Circle")) {
            if (o1.area() < o2.area())
                return 1;
            else if (o1.area() == o2.area())
                return 0;
            else
                return -1;
        } else {
            if (o1.name().equals("Circle"))
                return -1;
            else
                return 1;
        }
    }
}
