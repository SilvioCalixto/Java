public class VerificadorIdadeAutorizacao {
  public static void main(String[] args) {
    int idade = 17;
    boolean autorizacaoPais = true;

    boolean podeDirigir = idade >= 18 || autorizacaoPais;

    System.out.println("Pode dirigir? " + podeDirigir);
  }
}
