package condicionais;
import java.util.Scanner;

public class LoginLimitado {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        String loginPadrao = "usuario";
        int senhaPadrao = 1234;

        boolean logado = false;

        for(int i=1; i<=3; i++){
            System.out.println("Digite o login: ");
            String loginDigitado = scanner.nextLine();

            System.out.println("Digite a senha: ");
            int senhaDigitada = scanner.nextInt();
            scanner.nextLine();

            if(loginDigitado.equals(loginPadrao) && senhaDigitada==senhaPadrao){
                System.out.println("Você entrou com sucesso!");
                logado = true;
                break;
            } else{
                System.out.println("Erro! Tentativa "+ i + " de 3.");
            }
        }
    if(!logado){
        System.out.println("SISTEMA BLOQUEADO: Três tentativas falhas detectadas!");
    }

    }
}
