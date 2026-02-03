package condicionais;
import java.util.Scanner; import java.util.ArrayList; import java.util.List;

// Exercício: converter nota numérica em conceito (A, B, C, D, F).

public class SistemasDeNotas {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        List<Integer> listaNotas = new ArrayList<>();

        // bloco pra entrada de dados
        System.out.println("Digite sua nota em Redação: ");
        int notaRedacao = scanner.nextInt();
        listaNotas.add(notaRedacao);


        System.out.println("Digite sua nota em Matemática: ");
        int notaMatematica = scanner.nextInt();
        listaNotas.add(notaMatematica);

        System.out.println("Digite sua nota em Física: ");
        int notaFisica = scanner.nextInt();
        listaNotas.add(notaFisica);


        System.out.println("Digite sua nota em Química: ");
        int notaQuimica = scanner.nextInt();
        listaNotas.add(notaQuimica);

        // bloco pra lógica

        for(Integer notasDaLista : listaNotas){
            if (notasDaLista < 59){
                System.out.println("F");
            } else if (notasDaLista < 69) {
                System.out.println("D");
            } else if (notasDaLista < 79) {
                System.out.println("C");
            } else if (notasDaLista < 89) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }


    }
}
