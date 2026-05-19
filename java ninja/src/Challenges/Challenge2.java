package Challenges;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        String[] ninjaNames = new String[100];
        Scanner input = new Scanner(System.in);
        int properIndex = 0;
        boolean mustKeepLoop = true;

        while (mustKeepLoop && properIndex <= ninjaNames.length) {
            System.out.println("-----  OPTIONS  -----");
            System.out.print("1 - add a ninja\n2 - list ninjas\n3 - quit\n\nChose one of these: ");
            int userChoice = input.nextInt();
            input.nextLine();

            switch (userChoice) {
                case 1:
                    System.out.print("Enter ninja's name: ");
                    String ninjaName = input.nextLine();
                    ninjaNames[properIndex] = ninjaName;
                    properIndex++;
                    System.out.println(ninjaName + " was added to ninjas list.");
                    break;
                case 2:
                    System.out.println("----- NINJAS LIST -----");
                    for (int i = 0; i < properIndex; i++) {
                        System.out.println(i + 1 + " - " + ninjaNames[i]);
                    }


                    break;
                case 3:
                    mustKeepLoop = false;
                    break;
                default:
                    System.out.println("You choose a invalid option. try again!");


            }
        }
        input.close();
    }
}
