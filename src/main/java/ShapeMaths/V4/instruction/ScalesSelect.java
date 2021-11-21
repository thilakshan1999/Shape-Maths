package ShapeMaths.V4.instruction;

public class ScalesSelect implements ScaleSelector {
    public String selectScale(String selectShape){
        switch(selectShape)
        {
            case "Square":
                return "Length:";

            case "Circle":
                return "Radius:";

            case "Rectangle":
                return "Length,Width:";

            default:
                return null;
        }
    }
}
