package ShapeMaths.V4.input.shape;

import java.util.Scanner;

public class ShapeInput implements ShapeInputer {
    public String inputShape() throws InvalidShapeException
    {

        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        if(!(shape.equals("Square")||shape.equals("Circle")||shape.equals("Rectanle"))) {
            throw new InvalidShapeException("Type 'Circle' or 'Square' or 'Rectangle'");
        }
        return shape;
    }
}
