import java.util.Scanner;

public class EntradaSaidaDados {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número decimal: ");
    double numeroDecimal = scanner.nextDouble();

    System.out.println("Digite um caractere: ");
    char caractere = scanner.next().charAt(0);

    System.out.println("Você digitou o número " + numeroDecimal + " e o caractere " + caractere + ".");

    scanner.close();
  }
}
