package text.Ex7;

    public class Circle extends Shape{
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        protected double perimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        protected double area() {
            return Math.PI * Math.pow(radius, 2);
        }

        @Override
        String name() {
            return "Circle";
        }
    }
