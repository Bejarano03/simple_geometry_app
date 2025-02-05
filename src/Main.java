public class Main {
    public static void main(String[] args) {
        Circle smallCircle = new Circle("Circle", 5.0);
        String className = smallCircle.getClass().getSimpleName();
        System.out.println(className);
        smallCircle.calculateArea();
        smallCircle.calculatePerimeter();
        System.out.println();

        Rectangle smallRectangle = new Rectangle("Rectangle", 5, 5);
        String className2 = smallRectangle.getClass().getSimpleName();
        System.out.println(className2);
        smallRectangle.calculateArea();
        smallRectangle.calculatePerimeter();
        System.out.println();

        Triangle smallTriangle = new Triangle("Triangle", 5, 5, 5);
        String className3 = smallTriangle.getClass().getSimpleName();
        System.out.println(className3);
        smallTriangle.calculateArea();
        smallTriangle.calculatePerimeter();
        System.out.println();

    }
}
