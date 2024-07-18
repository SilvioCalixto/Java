import java.util.Scanner;

public class AreaTriangulo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a base do Triângulo: ");
    int base = scanner.nextInt();

    System.out.println("Digite a altura do Triângulo: ");
    int altura = scanner.nextInt();

    int area = (base * altura) / 2;
    
    System.out.println("A área do Trinângulo é: " + area + " !");
    
    scanner.close();
  }
  
}
