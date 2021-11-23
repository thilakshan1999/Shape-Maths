package ShapeMaths.V4.operation.circumference;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SquareCircumferenceOperationTest {
    @Test
    public void returnCircumferenceWhenInputLength(){
        SquareCircumferenceOperation squareCircumferenceOperation=new SquareCircumferenceOperation();
        double circumference=squareCircumferenceOperation.execute(new int[]{4});
        assertThat(circumference,is(4.0*(4)));
    }

}