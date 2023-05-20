public class Circle implements Shape{
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(){
        this.radius=0;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (3.14*radius*radius);
    }
}
