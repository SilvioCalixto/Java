public class ExercicioCalculadora {
  //função que soma dois numeros
  public static int somar(int a, int b) {
    return a + b;
  }
  //função que subtrai dois numeros
  public static int subtrair(int a, int b) {
    return a - b;
  }
    //Procedimento que exibe o resultado
  public static void exibirResultado(String operacao, int resultado) {
    System.out.println("Resultado da " + operacao + ": " + resultado);
  }

  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 5;

    int soma = somar(num1,num2);
    exibirResultado("soma", soma);

    int subtracao = subtrair(num1, num2);
    exibirResultado("subtração", subtracao);
  }
}