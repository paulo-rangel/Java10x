import java.util.Random;

public class LearingArrays {
    public static void main(String[] args) {
        Random ranint = new Random();
        int[] names = new int[3];
        for (int i = 0; i < 3 ; i++) {
            names[i] = ranint.nextInt(11) + 1;
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
