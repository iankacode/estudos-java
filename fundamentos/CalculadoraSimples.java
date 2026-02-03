package fundamentos;
import java.util.Scanner;


public class CalculadoraSimples {
    public static void main(String[] args) {


        System.out.println("Essa é uma calculadora simples, onde você pode escolher se quer: \n" +
                "somar, subtrair, dividir ou multiplicar DOIS números");


        Scanner scanner;
        scanner = new Scanner(System.in);


        System.out.println("Primeiro: Você quer SOMAR, SUBTRAIR, MULTIPLICAR OU DIVIDIR? ");
        String escolha = scanner.nextLine();
        escolha = escolha.toLowerCase();


        System.out.println("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();


        System.out.println("Digite o segundo número: ");
        double n2 = scanner.nextDouble();


        switch (escolha) {
            case "somar":
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case "subtrair":
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case "multiplicar":
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case "dividir":
                if (n2 != 0) {
                    System.out.println("Resultado: " + (n1 / n2));
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }


    }
}