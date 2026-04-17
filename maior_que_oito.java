import java.util.Scanner;

public class MaioresQueOito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            if (sc.nextDouble() > 8) {
                contador++;
            }
        }
        System.out.println("Quantidade de números maiores que 8: " + contador);

        sc.close();
    }
}