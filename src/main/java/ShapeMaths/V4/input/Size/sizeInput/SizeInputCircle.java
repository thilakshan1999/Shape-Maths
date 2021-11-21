package ShapeMaths.V4.input.Size.sizeInput;

import ShapeMaths.V4.input.Size.InvalidInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SizeInputCircle implements SizeInput {
    public int[] size() throws InvalidInputException, InputMismatchException
    {
        Scanner scanner=new Scanner(System.in);
        int radius=scanner.nextInt();
        if(radius<0){
            throw new InvalidInputException("Type positive value");
        }
        return new int[]{radius};

    }
}
