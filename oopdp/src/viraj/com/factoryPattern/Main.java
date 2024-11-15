package viraj.com.factoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Circle"); // Make sure this matches a valid case

            shape1.draw();

    }
}
