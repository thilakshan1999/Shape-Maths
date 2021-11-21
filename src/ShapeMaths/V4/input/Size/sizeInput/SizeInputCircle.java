package V4.input.Size.sizeInput;

import V4.input.Size.InvalidInputException;

import java.util.Scanner;

public class SizeInputCircle implements SizeInput {
    public int[] size() throws InvalidInputException
    {
        Scanner scanner=new Scanner(System.in);
        int radius=scanner.nextInt();
        if(radius<0){
            throw new InvalidInputException("Type positive value");
        }
        return new int[]{radius};
    }
}
