package condicionais;
import java.util.Scanner; import java.util.ArrayList; import java.util.List;

// Exercífico focado no IF

public class MaiordeTresNumeros {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        List<Double> listadeNumeros = new ArrayList<>();

        // pra adicionar algo na lista, é tipo listadeNumeros.add(valor);
        // pra pegar algo: listadeNumeros.get(a posção vc coloca aqui);
        // saber o tamanho: listadeNumeros.size();

        System.out.println("Digite o primeiro numero: ");
        Double primeiroNumero = scanner.nextDouble();
        listadeNumeros.add(primeiroNumero);

        System.out.println("Digite o segundo numero: ");
        Double segundoNumero = scanner.nextDouble();
        listadeNumeros.add(segundoNumero);

        System.out.println("Digite o terceiro numero: ");
        Double terceiroNumero = scanner.nextDouble();
        listadeNumeros.add(terceiroNumero);

        double maior = listadeNumeros.get(0);

        if (listadeNumeros.get(1) > maior){
            maior = listadeNumeros.get(1);
        }
        if (listadeNumeros.get(2) > maior){
            maior = listadeNumeros.get(2);
        }
        System.out.println("Os números que você escolheu foram: " + listadeNumeros);
        System.out.println("O maior número é: " + maior);

    }
}
