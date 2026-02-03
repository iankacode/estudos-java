package condicionais;
import java.util.Scanner;

public class SistemaDeDesconto {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Digite o valor total da sua compra: ");
        double valorTotal = scanner.nextDouble();

        // Se valor <= R$99,99 - 0%; Se valor > R$99,99 e <= 199,99 - 5%; Se >199,99 e <= 299,99 - 10%; Acima de R$299,99- 15%

        if (valorTotal <= 99.99) {
            System.out.println("Sua compra deu R$"+ valorTotal + " ,então não teve desconto");
        } else if (valorTotal <= 199.99){
            double valorDesconto = valorTotal - (valorTotal*0.05);
            System.out.println("Sua compra deu R$"+ valorTotal + " ,então teve desconto de 5%. O valor a ser pago agora é: R$"+ valorDesconto);
        } else if (valorTotal <= 299.99){
            double valorDesconto = valorTotal - (valorTotal*0.10);
            System.out.println("Sua compra deu R$"+ valorTotal + " ,então teve desconto de 10%. O valor a ser pago agora é: R$"+ valorDesconto);
        } else {
            double valorDesconto = valorTotal - (valorTotal*0.15);
            System.out.println("Sua compra deu R$"+ valorTotal + " ,então teve desconto de 15%. O valor a ser pago agora é: R$"+ valorDesconto);
        }

    }
}
