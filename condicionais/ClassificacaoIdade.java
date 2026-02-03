package condicionais;
import java.util.Scanner; import java.util.ArrayList; import java.util.List;

// Exercício: Classificação por idade (criança, adolescente, adulto, idoso)
// Focado em for e for-each

public class ClassificacaoIdade {
    static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        List<Integer> listaIdades = new ArrayList<>();

        int idade = 0;

        for (int i = 1; i<=5; i++){
            System.out.println("Entrada " + i + " : ");
            idade = scanner.nextInt();
            listaIdades.add(idade);
        }
        System.out.println("As idades que você digitou, são: " + listaIdades);

        for(Integer idadeDaLista: listaIdades) {
            if (idadeDaLista < 13) {
                System.out.println(idadeDaLista + " anos é idade de criança");
            } else if (idadeDaLista < 18) {
                System.out.println(idadeDaLista + " anos é idade de adolescente");
            } else if (idadeDaLista < 60) {
                System.out.println(idadeDaLista + " anos é idade de adulto");
            } else {
                System.out.println(idadeDaLista + " anos é idade de idoso");
            }
        }

    }
}
