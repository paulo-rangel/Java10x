package Challenges;
public class Challenge1 {
    public static void main(String[] args) {

        String[] names = {"Naruto Uzumaki", "Sakura Haruno", "Sasuke Uchiha"};
        int[] ages = {12, 12, 16};
        String[] missionNames = {
                "Tazuna Escort Mission",
                "Village Hidden in the Sand Invasion",
                "Sasuke Recovery Mission"
        };
        String[] difficultyLevels = {"C", "A", "A"};
        boolean[] isDone = {true, true, true};

        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
            System.out.println(ages[i]);
            System.out.println("mission: " + missionNames[i]);
            System.out.println("------------");
        }

        for(int i = 0; i < 3; i++){
            boolean isProperForUnder15Minor = difficultyLevels[i] == "C" || difficultyLevels[i] == "D";
            if( ages[i] < 15 && isProperForUnder15Minor){
                System.out.println(names[i] + " can conclude this mission!");
                isDone[i] = true;
            }else if (ages[i] < 15){
                System.out.println(names[i] + " cannot conclude this mission!");
                isDone[i] = false;
            }else{
                System.out.println(names[i] + " can conclude this mission!");
                isDone[i] = true;
            }
        }

    }
}

/*
* by doing this challenge I found this intellij shortcut "itar"
* that creates a for loop boilerplate to iterate over an array.
*
* disclaimer:
* I never watched Naruto this data was taken from an llm and might be wrong.
* */