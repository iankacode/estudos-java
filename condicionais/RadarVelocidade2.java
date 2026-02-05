package condicionais;
import java.util.Scanner; import java.util.List; import java.util.ArrayList;

// Atualização do código pra ele incluir a placa do carro.

public class RadarVelocidade2 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        List<Integer> listaVelocidade = new ArrayList<>();
        List<String> listaPlacaDoCarro = new ArrayList<>();

        int velocidadeMaxima = 80;
        int multaLeve = 130;
        int multaGrave = 880;

        int valorTotalMultas = 0;



        for(int i=1; i<=5; i++){
            System.out.println("Digite a velocidade do carro " + i);
            int velocidade = scanner.nextInt();
            listaVelocidade.add(velocidade);

            scanner.nextLine();

            System.out.println("Agora digite a PLACA deste carro: ");
            String placaDoCarro = scanner.nextLine();
            listaPlacaDoCarro.add(placaDoCarro);
        }
        for(int i = 0; i < listaVelocidade.size(); i++){
            int variavelVelocidade = listaVelocidade.get(i);
            String variavelPlaca = listaPlacaDoCarro.get(i);

            if(variavelVelocidade <= velocidadeMaxima){
                System.out.println("Carro de placa " + variavelPlaca + " com " + variavelVelocidade + " km/h: Isento");
            } else if(variavelVelocidade <= 100){
                System.out.println("Carro de placa " + variavelPlaca + " com " + variavelVelocidade + " km/h: Multa leve");
                valorTotalMultas += multaLeve;
            } else {
                System.out.println("Carro de placa " + variavelPlaca + " com " + variavelVelocidade + " km/h: Multa grave");
                valorTotalMultas += multaGrave;

            }
        }
        System.out.println("Valor acumulado das multas: R$" + valorTotalMultas);

    }
}
