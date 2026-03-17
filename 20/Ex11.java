import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        double idade = leitor.nextDouble();
        String valor = (idade < 12) ? "Paga R$ 10,00" : (idade >= 12 && idade < 60) ? "Paga R$ 20,00" : "Paga R$ 10,00";
        System.out.println(valor);
        leitor.close();
    }
}