package Scanners;

import java.util.Scanner;

public class LearningScanners {
    public static void main(String[] args) {
        String[] validNames = {"jerry smith", "beth Smith", "summer Smith", "rick Sanchez", "morty smith"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Rick and Morty's family member:");
        String name = input.nextLine().toLowerCase();
        input.close();
        switch (name) {
            case "jerry smith":
                System.out.println(name + " is an actual family member");
                break;
            case "beth smith":
                System.out.println(name + " is an actual family member");

            case "summer smith":
                System.out.println(name + " is an actual family member");
                break;
            case "rick sanchez":
                System.out.println(name + " is an actual family member");
                break;
            case "morty smith":
                System.out.println(name + " is an actual family member");
                break;
            default:
                System.out.println(name + " isn't an actual family member");
                break;
        }
    }
}
