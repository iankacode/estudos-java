package condicionais;
import java.util.Scanner; import java.util.ArrayList; import java.util.List;

public class RadarVelocidade {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        List<Integer> listaVelocidade = new ArrayList<>();


        int velocidadeMaxima = 80;
        int multaLeve = 130;
        int multaGrave = 880;

        int valorTotalMultas = 0;



        for(int i=1; i<=5; i++){
            System.out.println("Digite a velocidade do carro " + i);
            int velocidade = scanner.nextInt();
            listaVelocidade.add(velocidade);
        }
        for(Integer v: listaVelocidade){
              if(v <= velocidadeMaxima){
                  System.out.println("Carro com " + v + " km/h: Isento");
              } else if(v <= 100){
                  System.out.println("Carro com " + v + " km/h: Multa leve");
                  valorTotalMultas += multaLeve;
              } else {
                  System.out.println("Carro com " + v + " km/h: Multa grave");
                  valorTotalMultas += multaGrave;

              }
        }
        System.out.println("Valor acumulado das multas: R$" + valorTotalMultas);

    }
}
