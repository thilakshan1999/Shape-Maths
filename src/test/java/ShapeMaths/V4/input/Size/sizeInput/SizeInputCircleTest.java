package ShapeMaths.V4.input.Size.sizeInput;

import ShapeMaths.V4.input.Size.InvalidInputException;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class SizeInputCircleTest {
    @Test
    public void returnSameLengthInput() throws InvalidInputException, InputMismatchException {
        SizeInputCircle sizeInputCircle=new SizeInputCircle();
        InputStream in=new ByteArrayInputStream("5".getBytes());
        System.setIn(in);
        int[] result=sizeInputCircle.size();
        assertEquals(5,result[0]);
    }
    @Test
    public void returnErrorForNegativeInput() throws InputMismatchException{
        SizeInputCircle sizeInputCircle=new SizeInputCircle();
        InputStream in=new ByteArrayInputStream("-5".getBytes());
        System.setIn(in);
        boolean thrown=false;
        try{
            sizeInputCircle.size();
        }
        catch(InvalidInputException e){
            thrown=true;
        }
        assertTrue(thrown);

    }
    @Test
    public void returnErrorMisMatchInput() throws InvalidInputException{
        SizeInputCircle sizeInputCircle=new SizeInputCircle();
        InputStream in=new ByteArrayInputStream("5.8".getBytes());
        System.setIn(in);
        boolean thrown=false;
        try{
            sizeInputCircle.size();
        }
        catch(InputMismatchException e){
            thrown=true;
        }
        assertTrue(thrown);

    }

}