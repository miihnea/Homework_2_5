public class ShapeFactory {

    public Shape getShape(String shape){
        if(shape==null){
            return null;
        }else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle(1,2);
        }else if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle(1);
        }
        return null;
    }
}
