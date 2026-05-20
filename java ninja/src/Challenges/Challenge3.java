package Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Ninja {
    String name;
    int age;
    String mission;
    String missionStatus;
    String missionDifficulty;

    public void showInfo() {
        String output =
                "name: " + name +
                        "\nage: " + age +
                        "\nmission: " + mission +
                        "\nstatus: " + missionStatus +
                        "\ndifficulty: " + missionDifficulty;

        System.out.println(output);
    }
}

class Uchiha extends Ninja {
    String specialSkill;

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("special skill: " + specialSkill);
    }

    public void showSpecialSkill() {
        System.out.println("I'm " + name + " and my skill is " + specialSkill);
    }
}

public class Challenge3 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        List<Ninja> ninjas = new ArrayList<>();

        int optionIndex;
        boolean keepLoop = true;

        do {

            System.out.println("""
                    
                    1 - Add Ninja
                    2 - List Ninjas
                    3 - Show Ninja Info
                    4 - Use Uchiha Special Power
                    0 - Exit
                    """);

            optionIndex = userInput.nextInt();
            userInput.nextLine();

            switch (optionIndex) {

                case 1:

                    System.out.println("""
                            
                            1 - Generic Ninja
                            2 - Uchiha
                            """);

                    optionIndex = userInput.nextInt();
                    userInput.nextLine();
                    Ninja newNinjaInstance = null;
                    boolean isValidOption = true;

                    switch (optionIndex){
                        case 1:
                            newNinjaInstance = new Ninja();
                            break;
                        case 2:
                            newNinjaInstance = new Uchiha();
                            break;
                        default:
                            System.out.println("Invalid Option, returning to main menu...");
                            isValidOption = false;
                            break;
                    }

                    if(!isValidOption){
                        break;
                    }
                    
                    System.out.println("Enter ninja's name:");
                    newNinjaInstance.name = userInput.nextLine();

                    System.out.println("Enter ninja's age:");
                    newNinjaInstance.age = userInput.nextInt();
                    userInput.nextLine();

                    System.out.println("Enter ninja's mission name:");
                    newNinjaInstance.mission = userInput.nextLine();

                    System.out.println("Enter ninja's mission difficulty:");
                    newNinjaInstance.missionDifficulty = userInput.nextLine();

                    System.out.println("Enter ninja's mission status:");
                    newNinjaInstance.missionStatus = userInput.nextLine();

                    if (newNinjaInstance instanceof Uchiha) {

                        Uchiha uchiha = (Uchiha) newNinjaInstance;

                        System.out.println("Enter Uchiha's special skill:");
                        uchiha.specialSkill = userInput.nextLine();
                    }

                    ninjas.add(newNinjaInstance);

                    System.out.println(newNinjaInstance.name + " was added to the system.");

                    break;

                case 2:

                    if (ninjas.isEmpty()) {
                        System.out.println("No ninjas registered.");
                        break;
                    }

                    for (int i = 0; i < ninjas.size(); i++) {

                        Ninja ninja = ninjas.get(i);

                        System.out.println("Ninja #" + i);

                        ninja.showInfo();

                        System.out.println("----------------------------------------");
                    }

                    break;

                case 3:

                    if (ninjas.isEmpty()) {
                        System.out.println("No ninjas registered.");
                        break;
                    }

                    System.out.println("Select the ninja you want to show info from:");

                    for (int i = 0; i < ninjas.size(); i++) {
                        System.out.println(i + " - " + ninjas.get(i).name);
                    }

                    optionIndex = userInput.nextInt();
                    userInput.nextLine();

                    if (optionIndex >= 0 && optionIndex < ninjas.size()) {

                        ninjas.get(optionIndex).showInfo();

                    } else {

                        System.out.println("Invalid index.");
                    }

                    break;
                case 4:
                    System.out.println("Select the respective number:");
                    for (int i = 0; i < ninjas.size(); i++) {
                        if(ninjas.get(i) instanceof Uchiha){
                            System.out.println(i + " - " + ninjas.get(i).name);
                        };
                    };
                    optionIndex = userInput.nextInt();
                    userInput.nextLine();
                    Uchiha selectedUchiha = (Uchiha) ninjas.get(optionIndex);
                    selectedUchiha.showSpecialSkill();
                    break;

                case 0:

                    keepLoop = false;

                    System.out.println("Program finished.");

                    break;

                default:

                    System.out.println("Invalid option.");
            }

        } while (keepLoop);

        userInput.close();
    }
}