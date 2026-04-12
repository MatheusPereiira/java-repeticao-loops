import java.util.Scanner;

public class maiori{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int soma = 0;
    int idd;
    int totalm = 0;

    for (int i = 1; i<=20; i++){
      System.out.println("Digite a " + i + "ª idade");
      idd = sc.nextInt();
      soma += idd;
        if(idd >= 18){
         totalm++;
        }
    } 

    System.out.println("A quantidade de pessoas maiores de idade é de: " + totalm);

    sc.close();  
  }

}
