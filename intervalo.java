import java.util.Scanner;

public class VariosIntervalos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cat1 = 0, cat2 = 0, cat3 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int n = sc.nextInt();
            
            if (n >= 0 && n <= 100) cat1++;
            else if (n >= 101 && n <= 200) cat2++;
            else if (n > 200) cat3++;
        }

        System.out.println("Entre 0 e 100: " + cat1);
        System.out.println("Entre 101 e 200: " + cat2);
        System.out.println("Maiores que 200: " + cat3);

        sc.close();
    }
}