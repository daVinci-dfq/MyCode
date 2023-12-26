package text.Ex7;

import java.util.Comparator;

public class perimeterComparatorBySmall implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        if (o1.perimeter() < o2.perimeter())
            return -1;
        else if (o1.perimeter() == o2.perimeter())
            return 0;
        else
            return 1;
    }
}
