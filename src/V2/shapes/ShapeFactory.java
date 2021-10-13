package V2.shapes;

public class ShapeFactory {
    public void shapeSelector(String shape)
    {
        switch (shape) {
            case "Square":
                System.out.println(Square.square());
                break;
            case "Rectangle":
                System.out.println(Rectangle.rectangle());
                break;
            case "Circle":
                System.out.println(Circle.circle());
                break;
            default:
                System.out.println("Write the correct shape");
                break;

        }
    }
}
