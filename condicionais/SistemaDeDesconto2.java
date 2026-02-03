package condicionais;
import java.util.Scanner;

public class SistemaDeDesconto2 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Digite o valor total da sua compra: ");
        double valorTotal = scanner.nextDouble();

        // Se valor <= R$99,99 - 0%; Se valor > R$99,99 e <= 199,99 - 5%; Se >199,99 e <= 299,99 - 10%; Acima de R$299,99- 15%
        double porcentagem = 0;

        if (valorTotal <= 99.99) {
            porcentagem = 0;
        } else if (valorTotal <= 199.99) {
            porcentagem = 0.05;
        } else if (valorTotal <= 299.99) {
            porcentagem = 0.10;
        } else {
            porcentagem = 0.15;
        }

        double valorDesconto = valorTotal * porcentagem;
        double valorFinal = valorTotal - valorDesconto;

        System.out.println("Desconto aplicado: " + (porcentagem*100) + "%");
        System.out.println("Valor final: R$ " + valorFinal);

    }
}
