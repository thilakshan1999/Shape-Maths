package ShapeMaths.V4.operation.area;

public class RectangleAreaOperation implements AreaOperation {
    public double execute(int[] size)
    {
        final int length=size[0];
        final int width=size[1];
        return (double)width*length;
    }
}
