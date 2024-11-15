package viraj.com.factoryPattern;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        else if (shapeType == "Circle") {
            return new Circle();
        }
        else if (shapeType == "Rectangle") {
            return new Rectangle();
        }
        else{
            return null;
        }
    }
}
