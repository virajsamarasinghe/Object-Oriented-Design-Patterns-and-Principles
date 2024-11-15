package viraj.com.abstractFactoryPattern;

public class RoundedShapeFactory implements AbstractShapeFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new RoundedSquare();
        }
        return null;
    }
}


