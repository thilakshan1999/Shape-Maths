package V3.input.Size.sizeInput;

import java.util.Scanner;

public class SizeInputRectangle implements SizeInput {
    public int[] size()
    {
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();
        int width=scanner.nextInt();

        return new int[]{length,width};
    }
}
