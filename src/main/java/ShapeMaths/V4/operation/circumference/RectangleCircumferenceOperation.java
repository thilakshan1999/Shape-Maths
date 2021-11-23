package ShapeMaths.V4.operation.circumference;

public class RectangleCircumferenceOperation implements CircumferenceOperation {
    public double execute(int[] size)
    {
        final int length=size[0];
        final int width=size[1];
        return (double)2*(length+width);
    }
}
