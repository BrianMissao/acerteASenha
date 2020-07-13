import java.util.Scanner;

public class Resposta {
    private static int senhaCorreta = 2002;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int senhaDigitadaPeloUsuario = 0;
            while (senhaDigitadaPeloUsuario != senhaCorreta) {
            System.out.println("Digite a senha:");
            senhaDigitadaPeloUsuario = scanner.nextInt();
            if (senhaDigitadaPeloUsuario != senhaCorreta) {
                System.out.println("Senha inválida.");
            }
        }
        System.out.println("Acesso permitido!");
    }
}
