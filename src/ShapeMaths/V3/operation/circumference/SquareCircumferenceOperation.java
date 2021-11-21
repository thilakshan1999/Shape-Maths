package V3.operation.circumference;

public class SquareCircumferenceOperation implements CircumferenceOperation {
    public double execute(int[] size)
    {
        int length=size[0];
        return (double)length*length;
    }
}
