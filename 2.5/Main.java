public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1= shapeFactory.getShape("CIRCLE");
        System.out.println(shape1.getArea());

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        System.out.println(shape2.getArea());
    }
}
