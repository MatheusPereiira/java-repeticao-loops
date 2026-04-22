import java.util.Scanner;

public class SomaAteNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double numero;

        while (true) {
            System.out.print("Digite um número (negativo para parar): ");
            numero = sc.nextDouble();
            
            if (numero < 0) break;
            
            soma += numero;
        }
        System.out.println("A soma total é: " + soma);

        sc.close();
    }
}