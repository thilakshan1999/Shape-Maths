package ShapeMaths.V2.operation.area;

public class RectangleAreaOperation implements AreaOperation {
    public double execute(int[] size)
    {
        int length=size[0];
        int width=size[1];
        return (double)width*length;
    }
}
