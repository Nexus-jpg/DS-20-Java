import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        double num = leitor.nextDouble();
       System.out.println("Informe a segunda nota: ");
        double num2 = leitor.nextDouble();
        System.out.println("Informe a terceira nota : ");
        double num3 = leitor.nextDouble();
       System.out.println("Informe a quarta nota: ");
        double num4 = leitor.nextDouble();
     String resultado = ((num + num2 + num3 + num4) / 4 >= 7) ? "Aprovado" : ((num + num2 + num3 + num4) / 4 >= 5) && ((num + num2 + num3 + num4) / 4 < 7) ?  "Recuperação" : ((num + num2 + num3 + num4) / 4 < 5) ? "Reprovado" : "Reprovado";
        System.out.println(resultado);
        leitor.close();
    }
}