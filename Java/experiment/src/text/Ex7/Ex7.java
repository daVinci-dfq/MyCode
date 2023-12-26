package text.Ex7;

import java.util.Comparator;

public class Ex7 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[20];
        for (int i = 0; i < 20; i++) {
            int mark = (int)(Math.random() * 4);
            switch(mark) {
                case 0:
                    shapes[i] = new Rectangle(Math.random() * 10 + 1, Math.random() * 10 + 1);
                    break;
                case 1:
                    shapes[i] = new Square(Math.random() * 10 + 1);
                    break;
                case 2:
                    shapes[i] = new Diamond(Math.random() * 10 + 1, Math.random() * 10 + 1);
                    break;
                default:
                    shapes[i] = new Circle(Math.random() * 10 + 1);
                    break;
            }
        }
        print("Random", shapes);
        sort(shapes, new perimeterComparatorBySmall());
        print("Sort by Perimeter from Small to Big", shapes);
        sort(shapes, new perimeterComparatorByBig());
        print("Sort by Perimeter from Big to Small", shapes);
        sort(shapes, new areaComparatorBySmall());
        print("Sort by area from Small to Big", shapes);
        sort(shapes, new areaComparatorByBig());
        print("Sort by area from Big to Small", shapes);
        sort(shapes, new MyComparator());
        print("Sort by Myself", shapes);
    }
    public static void print(String str, Shape[] shapes) {
        System.out.println(str + ":");
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
    public static void sort(Shape[] shapes, Comparator<Shape> comparator) {
        for (int k = 1; k < shapes.length; k++) {
            for (int i = 1; i < shapes.length; i++) {
                if (comparator.compare(shapes[i], shapes[i - 1]) < 0) {
                    Shape temp = shapes[i];
                    shapes[i] = shapes[i - 1];
                    shapes[i - 1] = temp;
                }
            }
        }
    }
}
