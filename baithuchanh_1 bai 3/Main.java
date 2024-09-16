public class Main {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(7, 20);
    
            System.out.println("Chu vi của hình chữ nhật: " + rectangle.getPerimeter());
            System.out.println("Diện tích của hình chữ nhật: " + rectangle.getArea());

            Circle circle = new Circle(7);
    
            System.out.println("Chu vi của hình tròn: " + circle.getPerimeter());
            System.out.println("Diện tích của hình tròn: " + circle.getArea());
        }
    }
    
