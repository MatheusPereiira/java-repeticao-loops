import java.util.Scanner;

public class mediai{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int soma = 0;
    int idd;

    for (int i = 1; i<=20; i++){
      System.out.println("Digite a " + i + "ª idade");
      idd = sc.nextInt();
      soma += idd;
    }

    System.out.println("A média de idade das 20 pessoas é de: " + (soma / 20) + " anos");

    sc.close();  
  }

}
