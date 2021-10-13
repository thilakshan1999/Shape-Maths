package V2;


import V2.input.ShapeInput;
import V2.instruction.Welcome;
import V2.shapes.ShapeFactory;


public class Main {
    public static void main(String[] args) {

        Welcome welcome=new Welcome();
        System.out.println(welcome.print());

        ShapeInput shapeInput=new ShapeInput();
        String shape= shapeInput.inputShape();


        ShapeFactory shapeFactory=new ShapeFactory();
        shapeFactory.shapeSelector(shape);

    }
}




