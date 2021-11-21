package ShapeMaths.V3.input.Size.sizeInput;

import java.util.Scanner;

public class SizeInputSquare implements SizeInput {
    public int[] size()
    {
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();

        return new int[]{length};
    }
}
