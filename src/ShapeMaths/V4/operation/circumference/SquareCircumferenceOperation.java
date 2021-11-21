package V4.operation.circumference;

public class SquareCircumferenceOperation implements CircumferenceOperation {
    public double execute(int[] size)
    {
        final int length=size[0];
        return (double)length*length;
    }
}
