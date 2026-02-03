package fundamentos;
import java.util.Scanner;


public class OlaUsuario {
    public static void main() {
        Scanner scanner;
        scanner = new Scanner(System.in);


        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();


        System.out.println("Olá "+ nome + "! Seja bem vindo ao java!" );
    }
}
