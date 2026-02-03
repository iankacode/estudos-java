package condicionais;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        double saldoInicial = 1000.0;
        int escolhaMenu = 0;

        while (escolhaMenu != 4) {
            System.out.println("Bem vindo ao Caixa Eletrônico \nO que você deseja: \n 1. Ver Saldo \n 2. Depositar \n 3. Sacar \n 4. Sair \n");
            escolhaMenu = scanner.nextInt();
            switch (escolhaMenu) {
                case 1:
                    System.out.println("Seu saldo atual é R$: " + saldoInicial);
                    break;
                case 2:
                    System.out.println("Digite o quanto você quer depositar: ");
                    double valorDepositado = scanner.nextDouble();
                    saldoInicial = saldoInicial + valorDepositado;
                    System.out.println("Depósito concluído! O saldo atual é: R$ " + saldoInicial);
                    break;
                case 3:
                    System.out.println("Digite o quanto você quer sacar: ");
                    double valorSacar = scanner.nextDouble();

                    if (saldoInicial >= valorSacar) {
                        saldoInicial = saldoInicial - valorSacar;
                        System.out.println("Sucesso! Você sacou: R$" + valorSacar + " e seu saldo atual é: R$ " + saldoInicial);
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado e Até mais");
                    break;
            }

        }
    }
}
