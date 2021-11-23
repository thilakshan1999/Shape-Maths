package ShapeMaths.V4.operation.circumference;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CircleCircumferenceOperationTest {

    @Test
    public void returnCircumferenceWhenInputRadius(){
        CircleCircumferenceOperation circleCircumferenceOperation=new CircleCircumferenceOperation();
        double circumference=circleCircumferenceOperation.execute(new int[]{7});
        assertThat(circumference,is(3.14*7*2));
    }

}