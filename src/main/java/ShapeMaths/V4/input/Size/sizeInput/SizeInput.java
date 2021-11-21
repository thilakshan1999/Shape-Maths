package ShapeMaths.V4.input.Size.sizeInput;

import ShapeMaths.V4.input.Size.InvalidInputException;

import java.util.InputMismatchException;

public interface SizeInput {
   int[] size() throws InvalidInputException, InputMismatchException;
}
