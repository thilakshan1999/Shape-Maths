package ShapeMaths.V3.operation.circumference;

public class RectangleCircumferenceOperation implements CircumferenceOperation {
    public double execute(int[] size)
    {
        int length=size[0];
        int width=size[1];
        return (double)length*width;
    }
}
