public class ComparadorIdades {
  public static void main(String[]  args) {
    int idadePessoa1 = 25;
    int idadePessoa2 = 30;

    boolean saoMesmaIdade = idadePessoa1 == idadePessoa2;
    boolean pessoa1MaisVelha = idadePessoa1 > idadePessoa2;

    System.out.println("As idades são iguais: " + saoMesmaIdade);
    System.out.println("Pessoa 1 é mais velha: " + pessoa1MaisVelha);
  }
  
}
