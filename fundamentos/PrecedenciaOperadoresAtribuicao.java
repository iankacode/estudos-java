package fundamentos;

public class PrecedenciaOperadoresAtribuicao {

    static void main(String[] args) {

        int numero = 5;
        numero++;

        System.out.println("primeira incrementação: " + numero);

        numero++;
        System.out.println("segunda incrementação: " +numero);

        numero--;
        System.out.println("primeira decrementação: " +numero);

        numero--;
        System.out.println("segunda decrementação: " +numero);


    }



}
