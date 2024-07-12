public class VerificadorIdadeCNH {
  public static void main(String[] args) {
    int idade = 20;
    boolean possuiCNH = true;

    boolean podeDirigir = idade >= 18 && possuiCNH;

    System.out.println("Pode dirigir? " + podeDirigir);
  }
  
}
