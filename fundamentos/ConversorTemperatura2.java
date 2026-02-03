package fundamentos;
import java.util.Scanner;


public class ConversorTemperatura2 {
    public static void main(String[] args) {
        System.out.println("Esse programa irá te ajudar a converter temperatura");


        Scanner scanner;
        scanner = new Scanner(System.in);


        System.out.println("Qual é a temperatura atual? \n DIGITE APENAS O NÚMERO: ");
        double temperaturaAtual = scanner.nextDouble();


        scanner.nextLine();


        System.out.println("Qual é a unidade de temperatura (C, F ou K)?");
        String unidadeTemperatura = scanner.nextLine();


        System.out.println("E para qual unidade de temperatura gostaria de converter (C, F ou K)? ");
        String temperaturaConverter = scanner.nextLine();


        double resultado = temperaturaAtual;


        switch (temperaturaConverter.toLowerCase()){
            case "c":
                if (unidadeTemperatura.equalsIgnoreCase("f")){
                    resultado = (temperaturaAtual-32)/1.8;
                } else if(unidadeTemperatura.equalsIgnoreCase("k")) {
                    resultado = temperaturaAtual-273.15;
                } break;


            case "f":
                if (unidadeTemperatura.equalsIgnoreCase("c")){
                    resultado = (temperaturaAtual*1.8)+32;
                } else if(unidadeTemperatura.equalsIgnoreCase("k")){
                    resultado = (temperaturaAtual - 273.15)*1.8+32;
                } break;
            case "k":
                if(unidadeTemperatura.equalsIgnoreCase("c")){
                    resultado  = temperaturaAtual+273.15;
                } else if(unidadeTemperatura.equalsIgnoreCase("f")){
                    resultado = (temperaturaAtual-32)/1.8+273.15;
                } break;
            default:
                System.out.println("Erro: Unidade de destino inválida!");
                return;
        }
        System.out.printf("O resultado da conversão é: %.2f", resultado);
    }
}
