package V3.input;

import java.util.Scanner;

public class SizeInputSquare implements SizeInput {
    public int[] size()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Square:");
        int length=scanner.nextInt();

        return new int[]{length};
    }
}
