package V4.operation.area;

public class CircleAreaOperation implements AreaOperation {
    public double execute(int[] size)
    {
        final int radius=size[0];
        final double PI=3.14;
        return PI*radius*radius;
    }
}
