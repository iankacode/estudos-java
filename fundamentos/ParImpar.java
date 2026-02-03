package fundamentos;
import java.util.Scanner;


public class ParImpar {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Te ajudarei a descobrir se o número é impar ou par, ok?");
        Thread.sleep(2000);


        Scanner scanner;
        scanner = new Scanner(System.in);


        System.out.println("Digite o número: ");
        double numero = scanner.nextDouble();


        if(numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é impar");
        }


    }
}

