public abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void calculateArea();

    public abstract void calculatePerimeter();

    public String getName(){
        return name;
    }

}
