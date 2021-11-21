package ShapeMaths.V4.input.Size.sizeInput;

import ShapeMaths.V4.input.Size.InvalidInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SizeInputRectangle implements SizeInput {
    public int[] size() throws InvalidInputException , InputMismatchException {
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();
        int width=scanner.nextInt();
        if(length<0||width<0){
            throw new InvalidInputException("Type positive value");
        }
        return new int[]{length,width};
    }
}
