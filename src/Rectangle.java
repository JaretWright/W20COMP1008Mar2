public class Rectangle implements TwoDimensionalShape{
    private double length, width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getArea()
    {
        return length*width;
    }

    protected double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0)
            this.length = length;
        else
            throw new IllegalArgumentException("length must be greater than 0");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String toString()
    {
        return String.format("%s %.1fx%.1f", (length==width)?"Square":"Rectangle",length,width);
    }
}
