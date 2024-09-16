public class Rectangle {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Vui lòng nhập chiều rộng và chiều cao.");
            return;
        }

        try {
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);

            if (width > 0 && height > 0) {
                int perimeter = 2 * (width + height);
                int area = width * height;

                System.out.println("Chu vi của hình chữ nhật: " + perimeter);
                System.out.println("Diện tích của hình chữ nhật: " + area);
            } else {
                System.out.println("Chiều rộng và chiều cao phải là các số nguyên dương.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập các số nguyên hợp lệ cho chiều rộng và chiều cao.");
        }
    }
}
