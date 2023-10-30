package org.example.main2;

public class SwitchExpression {
    public static void main(String[] args) {
        String season = "Summer";
        switch (season) {
            case "Sring":
                System.out.println("M A Wiosnę");
                break;
            case "Summer":
                System.out.println("M A Lato");
                break;
            case "Autumn":
                System.out.println("M A Jesień");
                break;
            case "Winter":
                System.out.println("M A Zimę");
                break;
            default:
                System.out.println("Nie ma takiej pory roku");


        }
    }
}
