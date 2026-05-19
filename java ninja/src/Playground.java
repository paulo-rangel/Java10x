public class Playground
{
    public static void main(String[] args) {


// 2. Crie um programa que:
// - Receba um número
// - Diga se ele é par ou ímpar (use operador ternário)

// 3. Crie um programa com switch:
// - Recebe um número de 1 a 3
// - Imprime: "Opção 1", "Opção 2" ou "Opção 3"

    /*    Scanner sc = new Scanner(System.in);
        int[] numbers = {0,0,0,0,0};
        int sum = 0;
        for(int i = 0; i <= 4;i++){
            System.out.println("Enter a number to the list: ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        sc.close();
        System.out.println("Sum: " + sum);*/


/*    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
        System.out.println((n % 2 == 0) ? "even number" : "odd number");

 */

    /*Scanner sc = new Scanner(System.in);
    int option = sc.nextInt();
    switch (option){
        case 1:
            System.out.println("Option 1 was selected.");
            break;
        case 2:
            System.out.println("Option 2 was selected.");
            break;
        case 3:
            System.out.println("Option 3 was selected.");
            break;
        default:
            System.out.println("invalid option selected.");
            break;
    }*/
        String ranint = new String("test");
        String n = ranint;
        System.out.println(n);
        ranint = "hi";
        System.out.println(n);
    }

}
