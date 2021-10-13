package V2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Shape Maths");
        System.out.println("Select the shape:");
        Scanner scanner=new Scanner(System.in);
        String shape=scanner.nextLine();
        //Shape factory
        switch(shape){
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

//                comment
        }

    }




