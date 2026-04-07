
import java.util.Scanner;

public class usuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int num;
        
        for (int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "º número: ");
            num = sc.nextInt();
            soma += num;
        }

        System.out.println("O resultado da soma dos 10 números é: " + soma);

        sc.close();
    }
}

