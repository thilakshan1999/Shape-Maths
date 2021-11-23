package ShapeMaths.V4.input.Size.sizeInput;

import ShapeMaths.V4.input.Size.InvalidInputException;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class SizeInputRectangleTest {
    @Test
    public void returnSameLengthInput() throws InvalidInputException, InputMismatchException {
        SizeInputRectangle sizeInputRectangle=new SizeInputRectangle();
        InputStream in=new ByteArrayInputStream(("5"+System.lineSeparator()+"2").getBytes());
        System.setIn(in);
        int[] result= sizeInputRectangle.size();
        assertTrue(result[0]==5&&result[1]==2);
    }
    @Test
    public void returnErrorForNoNegativeInput() throws InputMismatchException{
        SizeInputRectangle sizeInputRectangle=new SizeInputRectangle();
        InputStream in=new ByteArrayInputStream(("-5"+System.lineSeparator()+"2").getBytes());
        System.setIn(in);
        boolean thrown=false;
        try{
            sizeInputRectangle.size();
        }
        catch(InvalidInputException e){
            thrown=true;
        }
        assertTrue(thrown);
    }

    @Test
    public void returnErrorFor1stNoMisMatchInput() throws InvalidInputException{
        SizeInputRectangle sizeInputRectangle=new SizeInputRectangle();
        InputStream in=new ByteArrayInputStream(("-5.5"+System.lineSeparator()+"2").getBytes());
        System.setIn(in);
        boolean thrown=false;
        try{
            sizeInputRectangle.size();
        }
        catch(InputMismatchException e){
            thrown=true;
        }
        assertTrue(thrown);

    }

}