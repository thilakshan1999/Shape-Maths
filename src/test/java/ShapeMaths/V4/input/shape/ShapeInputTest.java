package ShapeMaths.V4.input.shape;


import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class ShapeInputTest {

    @Test
    public void returnSquareWhenInputSquare() throws InvalidShapeException {
        ShapeInput shapeInput=new ShapeInput();
        String[] inputArray={"Square","Rectangle","Circle"};
        for(String input: inputArray) {
            InputStream in=new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            String result=shapeInput.inputShape();
            assertEquals(input,result);
        }
    }

    @Test
    public void returnErrorWhenInputInvalidString()  {
        ShapeInput shapeInput=new ShapeInput();
        String input="hi dr";
        InputStream in=new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        boolean Throw=false;
        try{
            shapeInput.inputShape();
        }
        catch(InvalidShapeException e){
            Throw=true;
        }
        assertTrue(Throw);
    }
}