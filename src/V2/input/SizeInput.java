package V2.input;

import java.util.Scanner;

public class SizeInput {
    public int inputSize()
    {
        System.out.println("Type the size");
        Scanner scanner=new Scanner(System.in);
        int size= scanner.nextInt();
        return size;
    }
}
