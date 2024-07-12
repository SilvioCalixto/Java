import java.util.Scanner;

public class CategoriaIdade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite sua idade: ");
    int idade = scanner.nextInt();

    if (idade < 12) {
      System.out.println("Criança");
    } else if (idade < 18) {
      System.out.println("Adolescente");
    } else if (idade < 60) {
      System.out.println("Adulto");
    } else {
      System.out.println("Idoso");
    }
  }
}
