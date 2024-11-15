package viraj.com.abstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        AbstractShapeFactory shapeFactory = FactoryProducer.getFactory(false); // Get normal shapes factory
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();

        shapeFactory = FactoryProducer.getFactory(true); // Get rounded shapes factory
        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();
    }
}
