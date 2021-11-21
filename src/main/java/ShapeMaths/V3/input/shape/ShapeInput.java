package ShapeMaths.V3.input.shape;

import java.util.Scanner;

public class ShapeInput implements ShapeInputer{
    public String inputShape()
    {

        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        return shape;
    }
}
