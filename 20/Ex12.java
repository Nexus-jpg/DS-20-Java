import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe uma nota: ");
        double num = leitor.nextDouble();
        String resultado = (num >= 9 && num <= 10) ? "Nota A" : (num >= 7 && num <= 8) ? "Nota B" :(num >= 5 && num <= 6) ? "Nota C" : (num >= 0 && num <= 4) ? "Nota D" : "Nota inválida";
        System.out.println(resultado);

        leitor.close();
    }
}