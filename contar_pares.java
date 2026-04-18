import java.util.Scanner;

public class ContarPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            if (sc.nextInt() % 2 == 0) {
                pares++;
            }
        }
        System.out.println("Total de números pares: " + pares);

        sc.close();
    }
}