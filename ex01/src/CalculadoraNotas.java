public class CalculadoraNotas {
  public static void main(String[] args) {
      int nota1 = 85;
      int nota2 = 90;
      int nota3 = 78;

      int soma = nota1 + nota2 + nota3;
      double media = soma / 3.0;

      System.out.println("A soma das notas é: " + soma);
      System.out.println("A média das notas é: " + media);
  }
}
