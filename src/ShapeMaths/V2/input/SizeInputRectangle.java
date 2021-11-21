package V2.input;

import java.util.Scanner;

public class SizeInputRectangle implements SizeInput {
    public int[] size()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Length:");
        int length=scanner.nextInt();
        System.out.print("Width:");
        int width=scanner.nextInt();

        return new int[]{length,width};
    }
}
