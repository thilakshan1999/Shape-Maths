package ShapeMaths.V4.operation.circumference;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class RectangleCircumferenceOperationTest {

    @Test
    public void returnCircumferenceWhenInputLengthWidth(){
        RectangleCircumferenceOperation rectangleCircumferenceOperation=new RectangleCircumferenceOperation();
        double circumference=rectangleCircumferenceOperation.execute(new int[]{4,5});
        assertThat(circumference,is(2.0*(4+5)));
    }

}