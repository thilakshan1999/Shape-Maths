package V3.input.Size.sizeInput;

import java.util.Scanner;

public class SizeInputCircle implements SizeInput {
    public int[] size()
    {
        Scanner scanner=new Scanner(System.in);
        int radius=scanner.nextInt();

        return new int[]{radius};
    }
}
