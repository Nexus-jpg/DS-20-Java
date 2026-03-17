import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num = leitor.nextDouble();
       System.out.println("Digite outro numero: ");
        double num2 = leitor.nextDouble();
     String resultado = (num > num2) ? "O primeiro numero é maior" : (num < num2) ? "O segundo numero é maior" : "Os numeros são iguais";
        System.out.println(resultado);

        leitor.close();
    }
}

