package text.Ex7;

    public class Rectangle extends Shape{
        protected double longSide;
        protected double shortSide;
        public Rectangle(double longSide, double shortSide) {
            this.longSide = longSide;
            this.shortSide = shortSide;
        }
        @Override
        protected double perimeter() {
            return (longSide + shortSide) * 2;
        }

        @Override
        protected double area() {
            return longSide * shortSide;
        }

        @Override
        String name() {
            return "Rectangle";
        }
    }
