package ShapeMaths.V2.operation.circumference;

public class CircleCircumferenceOperation implements CircumferenceOperation{
    public double execute(int[] size)
    {
        int radius=size[0];
        final double PI=3.14;
        return 2*PI*radius;
    }
}
