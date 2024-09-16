public class Circle {
    private int radius;
    public Circle(int radius) {
        setRadius(radius); 
    }

    public int getRadius() {
        return radius;
    }


    public void setRadius(int radius) {
        if (Common.isPositive(radius)) {
            this.radius = radius;
        } else {
            System.out.println("Bán kính phải là số nguyên dương.");
        }
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
