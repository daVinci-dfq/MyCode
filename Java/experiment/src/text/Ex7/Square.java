package text.Ex7;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }
    @Override
    String name() {
        return "Square";
    }

}
