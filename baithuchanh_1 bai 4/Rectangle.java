public class Rectangle {
    class rectangle extends Shape {
        private int width;
        private int height;
    
        public rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
    
        @Override
        public double getPerimeter() {
            return 2 * (width + height);
        }
    
        @Override
        public double getArea() {
            return width * height;
        }
    }
}
