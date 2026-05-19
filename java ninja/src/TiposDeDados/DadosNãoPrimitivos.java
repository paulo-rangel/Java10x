package TiposDeDados;

public class DadosNãoPrimitivos {
    public static void main(String[] args) {
        String name = "Naruto Uzumaki";
        String village = "Leaf Village";
        name = name.toUpperCase();
        System.out.println(name);
        System.out.println(village.toLowerCase());

        if(45 > 46){
            System.out.println("I love it! I love coding!");
        } else if (45 > 46){
            System.out.println("I still love coding!");
        } else {
            System.out.println("I just love it!");
        }
    }
}
