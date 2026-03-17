import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num = leitor.nextDouble();
      int v = (int) num % 2;
        String resultado = (v == 0) ? "O numero é par" : "O numero é impar";

        System.out.println(resultado);
        leitor.close();
    }
}