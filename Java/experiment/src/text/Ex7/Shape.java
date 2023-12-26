package text.Ex7;

import java.text.DecimalFormat;

public abstract class Shape {
    DecimalFormat df = new DecimalFormat("0.00");
    abstract double perimeter();

    abstract double area();

    abstract String name();

    @Override
    public String toString() {
        return this.name() + ": " + "perimeter = " + df.format(perimeter()) + ", area = " + df.format(area());
    }
}