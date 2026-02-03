package condicionais;
import java.util.Scanner;


public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Olá! Digite a seguir o número da operação que você quer fazer: \n" +
                "1. Adição \n 2. Subtração \n 3. Multiplicação \n 4. Divisão");
        int operacao = scanner.nextInt();

        System.out.println("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        switch (operacao){
            case 1:
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Resultado: " + (n1 / n2));
                break;
            default:
                System.out.println("Erro: Operação Invalida!");
                return;
        }


    }
}
