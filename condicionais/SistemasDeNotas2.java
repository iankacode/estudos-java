package condicionais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Exercício: converter nota numérica em conceito (A, B, C, D, F).

public class SistemasDeNotas2 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        List<Integer> listaNotas = new ArrayList<>();
        List<String> listaDeMaterias = new ArrayList<>();

        // bloco pra entrada de dados
        System.out.println("Digite sua nota em Redação: ");
        int notaRedacao = scanner.nextInt();
        listaNotas.add(notaRedacao);
        listaDeMaterias.add("Redação");

        System.out.println("Digite sua nota em Matemática: ");
        int notaMatematica = scanner.nextInt();
        listaNotas.add(notaMatematica);
        listaDeMaterias.add("Matemática");

        System.out.println("Digite sua nota em Física: ");
        int notaFisica = scanner.nextInt();
        listaNotas.add(notaFisica);
        listaDeMaterias.add("Física");

        System.out.println("Digite sua nota em Química: ");
        int notaQuimica = scanner.nextInt();
        listaNotas.add(notaQuimica);
        listaDeMaterias.add("Química");


        // bloco pra lógica

        for(int i=0; i<listaNotas.size(); i++){
            int nota = listaNotas.get(i);
            String materia = listaDeMaterias.get(i);
            String conceito = "";

            if (nota < 59){
                conceito = "F";
            } else if (nota < 69) {
                conceito = "D";
            } else if (nota < 79) {
                conceito = "C";
            } else if (nota < 89) {
                conceito = "B";
            } else {
                conceito = "A";
            }

            System.out.println(materia+": "+ conceito);
        }

    }
}
