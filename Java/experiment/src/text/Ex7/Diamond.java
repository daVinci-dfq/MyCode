package text.Ex7;

    public class Diamond extends Shape{
        private double diagonal1;
        private double diagonal2;
        public Diamond(double diagonal1, double diagonal2) {
            this.diagonal1 = diagonal1;
            this.diagonal2 = diagonal2;
        }
        @Override
        protected double perimeter() {
            return 2 * Math.sqrt(Math.pow(diagonal1, 2) + Math.pow(diagonal2, 2));
        }

        @Override
        protected double area() {
            return diagonal1 * diagonal2 / 2;
        }

        @Override
        String name() {
            return "Diamond";
        }
    }
