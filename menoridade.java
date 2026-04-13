import java.util.Scanner;

public class li {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeMaisNovo = "";
        int menorIdade = Integer.MAX_VALUE; 

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String nome = sc.next(); 
            
            System.out.print("Digite a idade de " + nome + ": ");
            int idd = sc.nextInt();

            
            if (idd < menorIdade) {
                menorIdade = idd;     
                nomeMaisNovo = nome; 
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);

        sc.close();
    }
}
