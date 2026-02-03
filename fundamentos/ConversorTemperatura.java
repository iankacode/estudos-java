package fundamentos;
import java.util.Scanner;


public class ConversorTemperatura {
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


        switch (temperaturaConverter.toLowerCase()){
            case "c":
                if (unidadeTemperatura.equalsIgnoreCase("f")){
                    double converterFC = (temperaturaAtual-32)/1.8;
                    System.out.println("A conversão de "+temperaturaAtual+"Fahrenheit para Celcius é: "+converterFC);
                } else if(unidadeTemperatura.equalsIgnoreCase("k")) {
                    double converterKC = temperaturaAtual-273.15;
                    System.out.println("A conversão de "+temperaturaAtual+"Kelvin para Celcius é: "+converterKC);
                } break;


            case "f":
                if (unidadeTemperatura.equalsIgnoreCase("c")){
                    double converterCF = (temperaturaAtual*1.8)+32;
                    System.out.println("A conversão de "+temperaturaAtual+"Celcius para Fahrenheit é: "+converterCF);
                } else if(unidadeTemperatura.equalsIgnoreCase("k")){
                    double converterKF = (temperaturaAtual - 273.15)*1.8+32;
                    System.out.println("A conversão de "+temperaturaAtual+"Kelvin para Fahrenheit é: "+converterKF);
                } break;
            case "k":
                if(unidadeTemperatura.equalsIgnoreCase("c")){
                    double converterCK = temperaturaAtual+273.15;
                    System.out.println("A conversão de "+temperaturaAtual+"Celcius para Kelvin é: "+converterCK);
                } else if(unidadeTemperatura.equalsIgnoreCase("f")){
                    double converterFK = (temperaturaAtual-32)/1.8+273.15;
                    System.out.println("A conversão de "+temperaturaAtual+"Fahrenheit para Kelvin é: "+converterFK);
                } break;


        }


    }
}


// Depois irei fazer uma versão do Conversor Temperatura utilizando o DRY, guardando o resultado numa variavel e imprimindo uma unica vez ao final do switch
