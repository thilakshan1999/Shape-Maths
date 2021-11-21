package ShapeMaths.V2.input;

import java.util.Scanner;

public class SizeInputCircle implements SizeInput{
    public int[] size()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Radius:");
        int radius=scanner.nextInt();

        return new int[]{radius};
    }
}
