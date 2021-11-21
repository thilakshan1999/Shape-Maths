package V2.input;

import java.util.Scanner;

public class ShapeInput {
    public String inputShape()
    {
        System.out.println("Select the shape:");
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        return shape;
    }
}
