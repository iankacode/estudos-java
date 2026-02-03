package condicionais;
import java.util.Scanner;

public class LoginSimples {
    public static void main(String[] args) {
        String loginPadrao = "usuario";
        int senhaPadrao = 1234;

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Digite o login: ");
        String loginDigitado = scanner.nextLine();

        System.out.println("Digite a senha: ");
        int senhaDigitada = scanner.nextInt();

        if(senhaDigitada != senhaPadrao){
           System.out.println("Senha incorreta");
         } else if(!loginDigitado.equals(loginPadrao)){
            System.out.println("Login incorreto");
         } else{
           System.out.println("Você entrou com sucesso");
         }

    }

}
