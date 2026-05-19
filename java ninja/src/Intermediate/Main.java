package Intermediate;
public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        Haruno sakura = new Haruno();
        sakura.name = "Sakura Haruno";
        Uchiha sasuke = new Uchiha();

        naruto.name = "Naruto Uzumaki";
        sasuke.name = "Sasuke Uchiha";
        sasuke.age = 30;
        sasuke.village = "leaf village";
        System.out.println(sasuke.name);
        sasuke.activeSharigan();
        naruto.activeWiseMode();
        sakura.activeHealingMode();




        System.out.println(sasuke.sayHello());
        System.out.println(sasuke.yearsToBecomeHokage(30));



    }
}
