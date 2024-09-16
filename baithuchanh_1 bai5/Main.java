
import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(5, 10));
        shapes.add(new Circle(7));
        shapes.add(new Rectangle(3, 6));
        shapes.add(new Circle(4));

        double totalPerimeter = 0;
        double totalArea = 0;

        for (Shape shape : shapes) {
            totalPerimeter += shape.getPerimeter();
            totalArea += shape.getArea();
        }

        System.out.println("Tổng chu vi của tất cả các hình: " + totalPerimeter);
        System.out.println("Tổng diện tích của tất cả các hình: " + totalArea);
    }
}
