import java.util.ArrayList;
import java.util.Arrays;

public class NotasAlunosArrays {
  public static void main(String[] args) {
    ArrayList<Integer> notas = new ArrayList<>(Arrays.asList(85, 90, 78, 92, 88));
    notas.add(95);

    for (int i = 0; i < notas.size(); i++) {
      System.out.println("Nota " + (i + 1) + ": " + notas.get(i));
    }
  }
}
