class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (Common.isPositive(width)) {
            this.width = width;
        } else {
            System.out.println("Chiều rộng phải là số nguyên dương.");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (Common.isPositive(height)) {
            this.height = height;
        } else {
            System.out.println("Chiều cao phải là số nguyên dương.");
        }
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }
}
