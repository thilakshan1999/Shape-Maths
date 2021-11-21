package ShapeMaths.V4.input.Size.sizeInput;

import ShapeMaths.V4.input.Size.InvalidInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SizeInputSquare implements SizeInput {
    public int[] size() throws InvalidInputException, InputMismatchException {
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();
        if(length<0){
            throw new InvalidInputException("Type positive value");
        }
        return new int[]{length};
    }
}
