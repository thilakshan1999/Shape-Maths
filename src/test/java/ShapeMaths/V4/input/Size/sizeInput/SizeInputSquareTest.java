package ShapeMaths.V4.input.Size.sizeInput;

import ShapeMaths.V4.input.Size.InvalidInputException;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SizeInputSquareTest {

    @Test
    public void returnSameLengthInput() throws InvalidInputException, InputMismatchException {
        SizeInputSquare sizeInputSquare=new SizeInputSquare();
        InputStream in=new ByteArrayInputStream("5".getBytes());
        System.setIn(in);
        int[] result=sizeInputSquare.size();
        assertEquals(5,result[0]);
    }
    @Test
    public void returnErrorForNegativeInput() throws InputMismatchException{
        SizeInputSquare sizeInputSquare=new SizeInputSquare();
        InputStream in=new ByteArrayInputStream("-5".getBytes());
        System.setIn(in);
        boolean thrown=false;
        try{
            sizeInputSquare.size();
        }
        catch(InvalidInputException e){
            thrown=true;
        }
        assertTrue(thrown);

    }
    @Test
    public void returnErrorMisMatchInput() throws InvalidInputException{
        SizeInputSquare sizeInputSquare=new SizeInputSquare();
        InputStream in=new ByteArrayInputStream("5.8".getBytes());
        System.setIn(in);
        boolean thrown=false;
        try{
            sizeInputSquare.size();
        }
        catch(InputMismatchException e){
            thrown=true;
        }
        assertTrue(thrown);

    }
}