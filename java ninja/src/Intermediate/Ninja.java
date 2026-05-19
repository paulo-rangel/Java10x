package Intermediate;
public class Ninja {
        String name;
        String village;
        int age;

        public String sayHello(){
                return "Hi! I'm " + name + ", and I'm a ninja!";
        }
        public String yearsToBecomeHokage(int minAge){
                if (age >= minAge){
                        return name + " can become an Hokage right now! He's " + age;
                }else{
                        return "It'll take " + (minAge-age) + " years until " + name + " can become an Hokage.";
                }
        }
}
