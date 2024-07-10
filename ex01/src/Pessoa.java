public class Pessoa {
  private String nome;
  private int idade;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void saudacao() {
    System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
  }

  public static void main(String[] args) {
    Pessoa p = new Pessoa();
    p.setNome("Alice");
    p.setIdade(30);
    p.saudacao();
  }
}
