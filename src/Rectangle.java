public class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        int area = length * width;
        System.out.println( "The rectangle area: " + area);
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = 2 * (length + width);
        System.out.println("The rectangle perimeter: " + perimeter);
    }
}
