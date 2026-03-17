import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe seu nome de usuario: ");
        String usuario = leitor.nextLine();
        System.out.println("Informe sua senha: ");
        String senha = leitor.nextLine();
        String chave = usuario + "|" + senha;
        switch (chave) {
            case "Kanon|3005":
                System.out.println("Login bem-sucedido!");
                break;

            default:
                System.out.println("Login falhou. Usuário ou senha incorretos.");


                
        }
                leitor.close();
    }
}
    



       
        