import java.util.Scanner;

public class nomerep {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();

        System.out.println("Digite quantas vezes você quer repetir o nome: ");
            int qtd = sc.nextInt();

            for(int i = 1; i <= qtd; ++i){
                System.out.println(nome);
            }

        sc.close();
    }

}
