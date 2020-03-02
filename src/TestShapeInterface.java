import java.util.ArrayList;

public class TestShapeInterface {
    public static void main(String[] args)
    {
        ArrayList<TwoDimensionalShape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(10,12));
        shapes.add(new Rectangle(10,10));
        shapes.add(new Circle(10));
        shapes.add(new Circle(12));

        for(TwoDimensionalShape shape:shapes)
            System.out.printf("%s has an area of %.2f%n",shape,shape.getArea());
    }
}
