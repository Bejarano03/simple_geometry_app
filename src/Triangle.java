public class Triangle extends Shape {
    int sideA;
    int sideB;
    int sideC;

    public Triangle(String name, int sideA, int sideB, int sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void calculateArea() {
        double s = (double) (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        System.out.println("The triangle area: " + area);
    }

    public void calculatePerimeter() {
        int perimeter = sideA + sideB + sideC;
        System.out.println("The triagnle perimeter: " + perimeter);
    }

}
