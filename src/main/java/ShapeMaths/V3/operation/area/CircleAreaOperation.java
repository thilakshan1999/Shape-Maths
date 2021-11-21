package ShapeMaths.V3.operation.area;

public class CircleAreaOperation implements AreaOperation {
    public double execute(int[] size)
    {
        int radius=size[0];
        final double PI=3.14;
        return PI*radius*radius;
    }
}
