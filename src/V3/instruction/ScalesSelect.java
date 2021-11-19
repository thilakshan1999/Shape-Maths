package V3.instruction;

public class ScalesSelector {
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
